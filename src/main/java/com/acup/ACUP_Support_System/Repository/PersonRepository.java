package com.acup.ACUP_Support_System.Repository;

import com.acup.ACUP_Support_System.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // We can add custom query methods if needed
}