package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.CompetitionPlayer;
import com.ne.latysh.dbproject.repository.CompetitionPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("competitionplayer")
public class CompetitionPlayerController {
    @Autowired
    private CompetitionPlayerRepository competitionPlayerRepository;

    @GetMapping("")
    public Iterable<CompetitionPlayer> getAll() {
        return competitionPlayerRepository.findAll();
    }
}
