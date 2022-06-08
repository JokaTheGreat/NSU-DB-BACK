package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.AthleteRanking;
import com.ne.latysh.dbproject.repository.AthleteRankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("athleteranking")
public class AthleteRankingController {
    @Autowired
    private AthleteRankingRepository athleteRankingRepository;

    @GetMapping("")
    public Iterable<AthleteRanking> getAll() {
        return athleteRankingRepository.findAll();
    }
}
