package com.example.demo31.services;

import com.example.demo31.entity.Person;
import com.example.demo31.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class PersonServiceImp implements PersonService{
    @Autowired
    PersonRepository personRepository ;
    @Override
    public Person saveProduit(Person p) {
        return personRepository.save(p);
    }

    @Override
    public Person updatePerson(Person p) {
        return personRepository.save(p);
    }

    @Override
    public void deletePerson(Person p) {
     personRepository.delete(p);
    }

    @Override
    public void deletePersonById(Long id) {
       personRepository.deleteById(id);
    }

    @Override
    public Person getPerson(Long id) {
        return personRepository.findById(id).get();
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
