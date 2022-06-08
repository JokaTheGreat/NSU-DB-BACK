package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.Sport;
import com.ne.latysh.dbproject.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sport")
public class SportController {
    @Autowired
    private SportRepository sportRepository;

    @GetMapping("")
    public Iterable<Sport> getAll() {
        return sportRepository.findAll();
    }
}
