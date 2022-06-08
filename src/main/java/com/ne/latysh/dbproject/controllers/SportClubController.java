package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.SportClub;
import com.ne.latysh.dbproject.repository.SportClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("sportclub")
public class SportClubController {
    @Autowired
    private SportClubRepository sportClubRepository;

    @GetMapping("")
    public Iterable<SportClub> getAll() {
        return sportClubRepository.findAll();
    }

    @GetMapping("/byperiod/{startdate}/{enddate}")
    public Iterable<?> getSportClubsAndCountAthletes(@PathVariable("startdate") String startDate,
                                                     @PathVariable("enddate") String endDate) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return sportClubRepository.getSportClubsAndCountAthletes(dateFormat.parse(startDate), dateFormat.parse(endDate));
    }
}
