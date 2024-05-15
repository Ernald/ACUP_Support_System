package com.acup.ACUP_Support_System.Service;

import com.acup.ACUP_Support_System.Repository.ReplyRepository;
import com.acup.ACUP_Support_System.models.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyService {
    @Autowired
    private ReplyRepository replyRepository;

    public List<Reply> getAllReplies() {
        return replyRepository.findAll();
    }

    public Reply saveReply(Reply reply) {
        return replyRepository.save(reply);
    }

    public void deleteReply(Long id) {
        replyRepository.deleteById(id);
    }

    // We can add custom query methods if needed
}
