package com.example.webdemo.service.impl;

import com.example.webdemo.dao.UserDao;
import com.example.webdemo.entity.User;
import com.example.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 2:26
 * Description:
 */
@Repository(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public User getUser(String userName) {
        return userDao.getUser(userName);
    }
}
