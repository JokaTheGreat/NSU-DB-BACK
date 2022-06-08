package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.SportsFacilityType;
import com.ne.latysh.dbproject.repository.SportsFacilityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sportsfacilitytype")
public class SportsFacilityTypeController {
    @Autowired
    private SportsFacilityTypeRepository sportsFacilityTypeRepository;

    @GetMapping("")
    public Iterable<SportsFacilityType> getAll() {
        return sportsFacilityTypeRepository.findAll();
    }
}
