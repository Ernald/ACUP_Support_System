package com.acup.ACUP_Support_System.Repository;

import com.acup.ACUP_Support_System.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    // We can add custom query methods if needed

}
