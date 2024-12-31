package com.ans.test_spring_grd_svc.user.service;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class User {
    private int id;
    private String name;
    private String address;
}