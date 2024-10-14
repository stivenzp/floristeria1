package com.floristeria.floristeria.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.floristeria.floristeria.Service.FlorService;
import com.floristeria.floristeria.model.Flor;

@RestController
@RequestMapping("/flores")
public class FlorController {

    @Autowired
    private FlorService florService;

    @GetMapping
    public List<Flor> getAllFlores() {
        return florService.getAllFlores();
    }

    @GetMapping("/{id}")
    public Optional<Flor> getFlorById(@PathVariable Long id) {
        return florService.getFlorById(id);
    }

    @PostMapping
    public Flor addFlor(@RequestBody Flor flor) {
        return florService.addFlor(flor);
    }

    @PutMapping("/{id}")
    public Flor updateFlor(@PathVariable Long id, @RequestBody Flor florDetails) {
        return florService.updateFlor(id, florDetails);
    }
}
