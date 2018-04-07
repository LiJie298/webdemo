package com.example.webdemo.util;

import com.example.webdemo.entity.User;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.geojson.Polygon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.geo.GeoJson;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoDBTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Polygon polygon){
        mongoTemplate.save(polygon);
    }

    public void saveRegions(List<User> gisRegionList){
        mongoTemplate.insert(gisRegionList,User.class);
    }


    public <T> T findById(Class<T> entityClass, String id) {
        return mongoTemplate.findById(id, entityClass);
    }

    public <T> List<T> findAll(Class<T> entityClass) {
        return mongoTemplate.findAll(entityClass);
    }

    public <T> void remove(T entity) {
        mongoTemplate.remove(entity);
    }

    public <T> void add(T entity) {
        mongoTemplate.insert(entity);
    }

    public <T> void addAll(List<T> entity) {
        mongoTemplate.insertAll(entity);
    }

    public <T> void saveOrUpdate(T entity) {
        mongoTemplate.save(entity);
    }

    public <T> T findOne(Class<T> entityClass) {
        return mongoTemplate.findOne(new Query(), entityClass);
    }

    public List<Polygon> findIntersective(GeoJson geoJson) {
        Query query = new Query(Criteria.where("geometry").intersects(geoJson));
        List<Polygon> list = mongoTemplate.find(query, Polygon.class);
        return list;
    }

    public boolean isExistIntersective(GeoJson geoJson) {
        Query query = new Query(Criteria.where("geometry").intersects(geoJson).and("_id").is(100000));
        boolean res = mongoTemplate.exists(query, User.class);
        return res;
    }

    @Test
    public void insert(){
        MongoDatabase client =  mongoTemplate.getDb();
////        client.createCollection("user",new CreateCollectionOptions().autoIndex(true));
        MongoCollection collection =client.getCollection("user",User.class);
        User user = new User(LocalDateTime.now().getLong(ChronoField.SECOND_OF_DAY),"test","lijie");
        collection.insertOne(user);
//        mongoTemplate.insert(user,"");
    }
}
