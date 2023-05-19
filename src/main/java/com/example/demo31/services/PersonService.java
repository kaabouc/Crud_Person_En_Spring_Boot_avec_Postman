package com.example.demo31.services;

import com.example.demo31.entity.Person;

import java.util.List;

public interface PersonService {

    Person saveProduit(Person p);
    Person updatePerson(Person p);
   void deletePerson(Person p) ;
   void deletePersonById(Long id);
   Person getPerson(Long id);
   List<Person> getAllPerson() ;
}
