package com.example.webdemo.dao.Impl;

import com.example.webdemo.dao.UserDao;
import com.example.webdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 2:26
 * Description:
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<User> getAllUser() {
        return mongoTemplate.findAll(User.class);
    }

    @Override
    public User getUser(String userName, String passWord) {
        if (!isExitUserName(userName)) {
            return null;
        } else {
            User user = mongoTemplate.find(new Query(Criteria.where("userName").is(userName)), User.class).get(0);
            return user;
        }
    }

    @Override
    public boolean isExitUserName(String userName) {
        int count = (int) mongoTemplate.count(new Query(Criteria.where("userName").is(userName)), User.class);
        return count > 0 ? true : false;
    }
}
