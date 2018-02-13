package com.example.web;

import com.example.domain.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public ModelAndView list() {
        ModelAndView model = new ModelAndView("persons");
        model.addObject("persons", this.personService.getAll());
        return model;
    }

    @PostMapping("/persons")
    public String add(@ModelAttribute Person person) {
        this.personService.add(person);
        return "redirect:persons";
    }



}
