package com.example.webdemo.dao.Impl;

import com.example.webdemo.dao.PageListDao;
import com.example.webdemo.entity.Page;
import com.example.webdemo.mongo.MongoInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    private static final String COLLECTION = "page";
    @Autowired
    @Qualifier("writeMongo")
    private MongoTemplate writeMongo;

    @Override
    public List<Page> getAllPageList(int userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        query.with(Sort.by(Sort.Direction.ASC, "sort"));
        return writeMongo.find(query, Page.class, COLLECTION);
    }

    @Override
    public void insertPageList(Page page) {
        writeMongo.insert(page, COLLECTION);
    }
}
