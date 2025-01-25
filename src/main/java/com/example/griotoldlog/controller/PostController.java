package com.example.griotoldlog.controller;

import com.example.griotoldlog.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostController {

    @PostMapping("/posts")
    public String post(@RequestBody PostCreate postCreate) {
        log.info("postCreate = {}", postCreate);
        return "hello world";
    }

    @GetMapping("/posts")
    public String get() {
        return "hello world";
    }
}
