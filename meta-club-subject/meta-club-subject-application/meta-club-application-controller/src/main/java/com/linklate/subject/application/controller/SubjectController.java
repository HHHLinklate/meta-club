package com.linklate.subject.application.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class SubjectController {

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
