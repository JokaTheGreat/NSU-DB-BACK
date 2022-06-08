package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.AthleteRank;
import com.ne.latysh.dbproject.repository.AthleteRankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/athleterank")
public class AthleteRankController {
    @Autowired
    private AthleteRankRepository athleteRankRepository;

    @GetMapping("")
    public Iterable<AthleteRank> getAll() {
        return athleteRankRepository.findAll();
    }
}
