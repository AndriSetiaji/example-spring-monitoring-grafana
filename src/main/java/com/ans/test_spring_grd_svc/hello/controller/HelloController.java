package com.ans.test_spring_grd_svc.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("")
    public String hello() {
        LOGGER.info("Hello endpoint");
        return "Hello";
    }

    @GetMapping("/v2")
    public String hello2() {
        LOGGER.info("Hello2 endpoint");
        return "Hello2";
    }
}

