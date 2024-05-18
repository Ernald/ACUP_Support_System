package com.acup.ACUP_Support_System.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne
    private ForumThread thread;

    public Reply(){}

    public Reply(Long id, String content, ForumThread thread) {
        this.id = id;
        this.content = content;
        this.thread = thread;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ForumThread getThread() {
        return thread;
    }

    public void setThread(ForumThread thread) {
        this.thread = thread;
    }
}