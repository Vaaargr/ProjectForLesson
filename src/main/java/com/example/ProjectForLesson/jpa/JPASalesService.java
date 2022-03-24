package com.example.ProjectForLesson.jpa;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JPASalesService {

    @Autowired
    public JPASaleRepository jpaSaleRepository;


    public List<JPASale> getAll() {
        return jpaSaleRepository.findAll();
    }


    public JPASale getByID(int id) {
        return jpaSaleRepository.getById(id);
    }
}
