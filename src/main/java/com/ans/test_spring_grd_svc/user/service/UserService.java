package com.ans.test_spring_grd_svc.user.service;

import io.micrometer.core.annotation.Timed;
import io.micrometer.tracing.SpanName;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Slf4j
@Service
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @SpanName("serService.getUsers")
    public List<User> getUsers() {
        long start = System.currentTimeMillis();
        LOGGER.debug("starts getUsers");
        List<User> list = userDao.getUsers();
        LOGGER.info("total time:{}", System.currentTimeMillis() - start);
        return list;
    }

    @Timed(value = "userService.getStreamUsers", description = "Time taken to return getStreamUsers response")
    public Flux<User> getStreamUsers() {
        long start = System.currentTimeMillis();
        LOGGER.info("starts getStreamUsers");
        Flux<User> list = userDao.getUsersStream();
        LOGGER.info("total process time:{}", System.currentTimeMillis() - start);
        return list;
    }
}

