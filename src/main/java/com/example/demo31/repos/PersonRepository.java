package com.example.demo31.repos;

import com.example.demo31.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person , Long> {
}
