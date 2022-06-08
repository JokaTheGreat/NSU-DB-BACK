package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.Sponsor;
import com.ne.latysh.dbproject.repository.SponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("sponsor")
public class SponsorController {
    @Autowired
    private SponsorRepository sponsorRepository;

    @GetMapping("")
    public Iterable<Sponsor> getAll() {
        return sponsorRepository.findAll();
    }

    @GetMapping("/byperiod/{startdate}/{enddate}")
    public Iterable<?> getAndCountSponsorByPeriod(@PathVariable("startdate") String startDate,
                                                  @PathVariable("enddate") String endDate) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return sponsorRepository.getAndCountSponsorByPeriod(dateFormat.parse(startDate), dateFormat.parse(endDate));
    }
}
