package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.Competition;
import com.ne.latysh.dbproject.repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("competition")
public class CompetitionController {
    @Autowired
    private CompetitionRepository competitionRepository;

    @GetMapping("")
    public Iterable<Competition> getAll() {
        return competitionRepository.findAll();
    }

    @GetMapping(value = {"/byperiod/{startdate}/{enddate}/{sponsorid}", "/byperiod/{startdate}/{enddate}"})
    public List<Competition> getCompetitionByPeriod(@PathVariable("startdate") String startDate,
                                                              @PathVariable("enddate") String endDate,
                                                              @PathVariable("sponsorid") Optional<Long> sponsorId) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        var result = competitionRepository.getCompetitionByPeriod(dateFormat.parse(startDate), dateFormat.parse(endDate));
        return sponsorId.map(aLong -> result.stream().filter(competition -> competition.getSponsor().getId().equals(aLong)).collect(Collectors.toList())).orElse(result);
    }

    @GetMapping(value = {"/byfacility/{facilityid}", "/byfacility/{facilityid}/{sport}"})
    public List<Competition> getCompetitionByFacility(@PathVariable("facilityid") Long sportsFacilityId,
                                                      @PathVariable("sport") Optional<String> sportValue) {
        var result = competitionRepository.getCompetitionByFacility(sportsFacilityId);
        return sportValue.map(s -> result.stream().filter(competition -> competition.getSport().getValue().equals(s)).collect(Collectors.toList())).orElse(result);
    }
}
