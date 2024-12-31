package com.ans.test_spring_grd_svc.user.controller;

import com.ans.test_spring_grd_svc.user.service.User;
import com.ans.test_spring_grd_svc.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    private UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> getStreamUsers() {
        return userService.getStreamUsers();
    }

    @GetMapping(value = "/exception")
    public String throwError() {
        LOGGER.error("This is a test error.");
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "This is a test error.");
    }
}
