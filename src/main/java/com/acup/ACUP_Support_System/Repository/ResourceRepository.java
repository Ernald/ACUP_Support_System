package com.acup.ACUP_Support_System.Repository;

import com.acup.ACUP_Support_System.models.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
    // We can add custom query methods if needed
}
