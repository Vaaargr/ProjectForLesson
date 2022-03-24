package com.example.ProjectForLesson.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Try {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DataConfig.class);
        JPASalesService jpa = new JPASalesService();
        System.out.println(jpa.getAll());
        System.out.println(jpa.getByID(1));
    }
}
