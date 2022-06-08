package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.sportsfacility.*;
import com.ne.latysh.dbproject.repository.sportsfacility.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


@RestController
@RequestMapping("sportsfacility")
public class SportsFacilityController {
    @Autowired
    private SportsFacilityRepository sportsFacilityRepository;
    @Autowired
    private CourtRepository courtRepository;
    @Autowired
    private GymRepository gymRepository;
    @Autowired
    private StadiumRepository stadiumRepository;
    @Autowired
    private ArenaRepository arenaRepository;

    @GetMapping("")
    public Iterable<SportsFacility> getAll() {
        return sportsFacilityRepository.findAll();
    }

    @GetMapping("/bycompetitionperiod/{startdate}/{enddate}")
    public Iterable<?> getSportsFacilityByCompetitionPeriod(@PathVariable("startdate") String startDate,
                                                            @PathVariable("enddate") String endDate) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return sportsFacilityRepository.getSportsFacilityByCompetitionPeriod(dateFormat.parse(startDate), dateFormat.parse(endDate));
    }

    @GetMapping("/court")
    public Iterable<Court> getAllCourts() {
        return courtRepository.findAll();
    }

    @GetMapping("/court/{surface}")
    public List<Court> getCourtsBySurface(@PathVariable("surface") String surface) {
        return courtRepository.getCourtWithSurface(surface);
    }

    @GetMapping("/gym")
    public Iterable<Gym> getAllGyms() {
        return gymRepository.findAll();
    }

    @GetMapping("/gym/{floorArea:.+}")
    public Iterable<Gym> getGymByFloorArea(@PathVariable("floorArea") Double floorArea) {
        return gymRepository.getGymByFloorArea(floorArea);
    }

    @GetMapping("/stadium")
    public Iterable<Stadium> getAllStadiums() {
        return stadiumRepository.findAll();
    }

    @GetMapping("/stadium/{capacity}")
    public Iterable<Stadium> getStadiumByCapacity(@PathVariable("capacity") Long capacity) {
        return stadiumRepository.getStadiumByCapacity(capacity);
    }

    @GetMapping("/arena")
    public Iterable<Arena> getAllArenas() {
        return arenaRepository.findAll();
    }

    @GetMapping("/arena/{trackNumber}")
    public Iterable<Arena> getArenaByTrackNumber(@PathVariable("trackNumber") Long trackNumber) {
        return arenaRepository.getArenaByTrackNumber(trackNumber);
    }
}
