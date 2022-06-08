package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.Athlete;
import com.ne.latysh.dbproject.repository.AthleteRankRepository;
import com.ne.latysh.dbproject.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("athlete")
public class AthleteController {
    @Autowired
    private AthleteRepository athleteRepository;
    @Autowired
    private AthleteRankRepository athleteRankRepository;

    @GetMapping("")
    public Iterable<Athlete> getAll() {
        return athleteRepository.findAll();
    }

    @GetMapping("/bysport/{sport}/{athleterank}")
    public Iterable<Athlete> getAthletesByRanking(@PathVariable("sport") String sport,
                                                  @PathVariable("athleterank") String athleteRankValue) {
        var athleteRank = athleteRankRepository.findByValue(athleteRankValue);
        return athleteRepository.getAthletesByRanking(sport, athleteRank.getId());
    }

    @GetMapping("/bytrainerlicense/{trainerlicenseid}/{athleterank}")
    public Iterable<Athlete> getAthletesByTrainerAndRank(@PathVariable("trainerlicenseid") Long trainerLicenseId,
                                                         @PathVariable("athleterank") String athleteRankValue) {
        var athleteRank = athleteRankRepository.findByValue(athleteRankValue);
        return athleteRepository.getAthletesByTrainerAndRank(trainerLicenseId, athleteRank.getId());
    }

    @GetMapping("/morethanone")
    public Iterable<?> getAthletesWhoMoreThanOneSport() {
        return athleteRepository.getAthletesWhoMoreThanOneSport();
    }

    @GetMapping("/bycompetition/{competitionid}")
    public Iterable<Athlete> getAthletesWhoWinnerByCompetition(@PathVariable("competitionid") Long competitionId) {
        return athleteRepository.getAthletesWhoWinnerByCompetition(competitionId);
    }

    @GetMapping("/notincompetitionbyperiod/{startdate}/{enddate}")
    public Iterable<Athlete> getAthletesWhoNotInCompetitionByPeriod(@PathVariable("startdate") String startDate,
                                                                    @PathVariable("enddate") String endDate) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return athleteRepository.getAthletesWhoNotInCompetitionByPeriod(dateFormat.parse(startDate), dateFormat.parse(endDate));
    }
}
