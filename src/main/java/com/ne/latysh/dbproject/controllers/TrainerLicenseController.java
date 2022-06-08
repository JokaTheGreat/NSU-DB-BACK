package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.TrainerLicense;
import com.ne.latysh.dbproject.repository.TrainerLicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trainerlicense")
public class TrainerLicenseController {
    @Autowired
    private TrainerLicenseRepository trainerLicenseRepository;

    @GetMapping("")
    public Iterable<TrainerLicense> getAll() {
        return trainerLicenseRepository.findAll();
    }
}
