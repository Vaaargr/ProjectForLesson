package com.example.ProjectForLesson.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/try")
public class TryController {
    @Autowired
    private JPASaleRepository repository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<JPASale> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping(path = "/by-id")
    public @ResponseBody
    Optional<JPASale> getById(@RequestParam(value = "id") Integer id) {
        return repository.findById(id);
    }

    @PostMapping(path = "/update")
    public void update(@RequestBody JPASale jpaSale){
        repository.save(jpaSale);
    }

    @GetMapping(path = "/by-amount")
    public @ResponseBody
    Iterable<JPASale> findByAmountGreaterThan (@RequestParam(value = "amount") Integer amount){
        return repository.findByAmountGreaterThan(amount);
    }
}