package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.Training;
import com.ne.latysh.dbproject.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("training")
public class TrainingController {
    @Autowired
    private TrainingRepository trainingRepository;

    @GetMapping("")
    public Iterable<Training> getAll() {
        return trainingRepository.findAll();
    }
}
