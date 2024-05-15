package com.acup.ACUP_Support_System.Controller;

import com.acup.ACUP_Support_System.Service.ForumThreadService;
import com.acup.ACUP_Support_System.models.ForumThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/threads")
public class ForumThreadController {
    @Autowired
    private ForumThreadService forumThreadService;

    @GetMapping
    public List<ForumThread> getAllThreads() {
        return forumThreadService.getAllThreads();
    }

    @PostMapping
    public ForumThread addThread(@RequestBody ForumThread thread) {
        return forumThreadService.saveThread(thread);
    }

    @DeleteMapping("/{id}")
    public void deleteThread(@PathVariable Long id) {
        forumThreadService.deleteThread(id);
    }

    // We can add additional controller methods if needed
}
