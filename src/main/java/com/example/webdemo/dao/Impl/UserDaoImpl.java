package com.example.webdemo.dao.Impl;

import com.example.webdemo.dao.UserDao;
import com.example.webdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    /**
     * 数据库集合名称
     */
    private static final String COLLECTION = "USER";
    @Qualifier("writeMongo")
    @Autowired
    private MongoTemplate writeMogo;

    @Override
    public List<User> getAllUser() {
        return writeMogo.findAll(User.class, COLLECTION);
    }

    @Override
    public User getUser(String userName) {
        if (!isExitUserName(userName)) {
            return null;
        } else {
            User user = writeMogo.find(new Query(Criteria.where("userName").is(userName)), User.class, COLLECTION).get(0);
            return user;
        }
    }

    @Override
    public boolean isExitUserName(String userName) {
        int count = (int) writeMogo.count(new Query(Criteria.where("userName").is(userName)), User.class,COLLECTION);
        return count > 0 ? true : false;
    }
}
