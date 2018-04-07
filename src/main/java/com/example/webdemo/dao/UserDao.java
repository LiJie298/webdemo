package com.example.webdemo.dao;

import com.example.webdemo.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();

    User getUser(String userName, String password);

    boolean isExitUserName(String userName);
}
