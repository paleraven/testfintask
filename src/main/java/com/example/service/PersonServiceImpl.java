package com.example.service;

import com.example.domain.Person;
import com.example.repository.PersonRepository;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAll() {
        return Lists.newArrayList(this.personRepository.findAll());
    }

    @Override
    public void add(Person person) {
        this.personRepository.save(person);
    }
}
