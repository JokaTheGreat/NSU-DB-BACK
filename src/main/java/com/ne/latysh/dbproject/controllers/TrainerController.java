package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.Trainer;
import com.ne.latysh.dbproject.repository.SportRepository;
import com.ne.latysh.dbproject.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trainer")
public class TrainerController {
    @Autowired
    private TrainerRepository trainerRepository;
    @Autowired
    private SportRepository sportRepository;

    @GetMapping("")
    public Iterable<Trainer> getAll() {
        return trainerRepository.findAll();
    }

    @GetMapping("/byathlete/{athleteid}")
    public Iterable<Trainer> getTrainerByAthlete(@PathVariable("athleteid") Long athleteId) {
        return trainerRepository.getTrainerByAthlete(athleteId);
    }

    @GetMapping("/bysport/{sportvalue}")
    public Iterable<Trainer> getTrainersBySport(@PathVariable("sportvalue") String sportValue) {
        return trainerRepository.getTrainersBySport(sportRepository.findByValue(sportValue).getId());
    }

}
