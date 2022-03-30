package com.example.ProjectForLesson.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
public class ViewController {
    @Autowired
    private JPASaleRepository repository;

    @GetMapping("/auth")
    public String login(HttpSession httpSession, @RequestParam(name = "name") String name) {
        httpSession.setAttribute("name", name);
        return "redirect:/";
    }

    @GetMapping("/")
    public String home(HttpSession httpSession, Model model) {
        Object name = httpSession.getAttribute("name");
        if (name == null) {
            return "redirect:/login";
        }
        model.addAttribute("name", name.toString());
        List<JPASale> sales = repository.findAll();
        model.addAttribute("salesList", sales);
        model.addAttribute("jpaSale", new JPASale());
        return "home";
    }

    @PostMapping(path = "/update")
    public String update(@ModelAttribute JPASale jpaSale,HttpSession httpSession){
        Object name = httpSession.getAttribute("name");
        if (name == null) {
            return "redirect:/login";
        }
        repository.save(jpaSale);
        return "redirect:/";
    }
}
