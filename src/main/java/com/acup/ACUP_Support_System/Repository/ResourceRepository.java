package com.acup.ACUP_Support_System.Repository;

import com.acup.ACUP_Support_System.models.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
    List<Resource> findByNameContainingIgnoreCase(String name);
}
