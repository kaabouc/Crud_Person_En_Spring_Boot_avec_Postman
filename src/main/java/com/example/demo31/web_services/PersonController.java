package com.example.demo31.web_services;

import com.example.demo31.entity.Person;
import com.example.demo31.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PersonController {

    @Autowired
  private  PersonService personService ;

    @PostMapping("/add")
    public Person saveProduit(@RequestBody Person  p) {
        return personService.saveProduit(p);
    }

    @PutMapping("/edit")
    public Person updateProduit(@RequestBody Person p) {
        return personService.updatePerson(p);
    }

    @DeleteMapping("/delete")
    public void deleteProduit(@RequestBody Person p) {
        personService.deletePerson(p);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduitById(@PathVariable Long id) {
        personService.deletePersonById(id);
    }

    @GetMapping("/produit/{id}")
    public Person getProduit(@PathVariable Long id) {
        return personService.getPerson(id);
    }

    @GetMapping("/list")
    public List<Person> getAllProduits() {
        return personService.getAllPerson();
    }


}
