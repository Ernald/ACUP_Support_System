package com.acup.ACUP_Support_System.Repository;

import com.acup.ACUP_Support_System.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    // We can add custom query methods if needed
    List<Person> findByNameContainingIgnoreCase(String name);

}