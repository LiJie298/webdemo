package com.example.webdemo.service;

import com.example.webdemo.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 获取所有用户
     *
     * @param
     * @return
     */
    List<User> getAllUser();

    /**
     * 核对用户是否正确
     * @param userName
     * @return
     */
    User getUser(String userName);
}
