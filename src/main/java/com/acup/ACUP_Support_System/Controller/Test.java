package com.acup.ACUP_Support_System.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Test {
    @GetMapping
    public String startApp() {
        return "Test: This application run in port 8080";
    }

}