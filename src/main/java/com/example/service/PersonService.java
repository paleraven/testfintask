package com.example.service;

import com.example.domain.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAll();

    void add(Person person);
}
