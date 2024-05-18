package com.acup.ACUP_Support_System.Repository;

import com.acup.ACUP_Support_System.models.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {
    // We can add custom query methods if needed
}
