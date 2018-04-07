package com.example.webdemo.dao.Impl;

import com.example.webdemo.dao.PageListDao;
import com.example.webdemo.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 16:12
 * Description:
 */
@Repository(value = "pageDao")
public class PageListDaoImpl implements PageListDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Page> getAllPageList(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        query.with(Sort.by(Sort.Direction.ASC,"sort"));
        return mongoTemplate.find(query,Page.class);
    }

    @Override
    public void insertPageList(Page page) {
        mongoTemplate.insert(page);
    }
}
