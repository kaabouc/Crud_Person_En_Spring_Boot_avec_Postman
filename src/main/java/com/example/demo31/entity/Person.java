package com.example.demo31.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_person ;
    private String Name ;
    private String Prenom ;
    private Date Date_naiss  ;
    private Double Age ;
    private String Email ;

    public Person(){
        super();
    }
    public Person(String name, String prenom, Date date_naiss, Double age, String email) {
        Name = name;
        Prenom = prenom;
        Date_naiss = date_naiss;
        Age = age;
        Email = email;
    }
    public long getId_person() {
        return id_person;
    }

    public String getName() {
        return Name;
    }

    public String getPrenom() {
        return Prenom;
    }

    public Date getDate_naiss() {
        return Date_naiss;
    }

    public Double getAge() {
        return Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setId_person(long id_person) {
        this.id_person = id_person;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public void setDate_naiss(Date date_naiss) {
        Date_naiss = date_naiss;
    }

    public void setAge(Double age) {
        Age = age;
    }

    public void setEmail(String email) {
        Email = email;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id_person=" + id_person +
                ", Name='" + Name + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Date_naiss=" + Date_naiss +
                ", Age=" + Age +
                ", Email='" + Email + '\'' +
                '}';
    }

}
