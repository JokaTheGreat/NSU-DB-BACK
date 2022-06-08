package com.ne.latysh.dbproject.controllers;

import com.ne.latysh.dbproject.models.CourtSurface;
import com.ne.latysh.dbproject.repository.CourtSurfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courtsurface")
public class CourtSurfaceController {
    @Autowired
    private CourtSurfaceRepository courtSurfaceRepository;

    @GetMapping("")
    public Iterable<CourtSurface> getAll() {
        return courtSurfaceRepository.findAll();
    }
}
