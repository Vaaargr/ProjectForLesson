package com.example.ProjectForLesson.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JPASaleRepository extends JpaRepository<JPASale, Integer> {
   List<JPASale> getAll();
   JPASale getByID(int id);
   }