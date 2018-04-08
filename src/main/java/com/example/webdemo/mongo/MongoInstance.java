package com.example.webdemo.mongo;

import com.mongodb.ReadPreference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @author lijie7
 * @date 2018/4/8
 * @Description
 * @modified By
 */
@Component
public class MongoInstance {
    @Qualifier("mongoFactory")
    @Autowired
    private MongoDbFactory mongoDbFactory;

//    public @Bean(value = "readMongo")
//    MongoTemplate readMongoInstadnce() {
//        MongoTemplate template = new MongoTemplate(mongoDbFactory);
//        template.setReadPreference(ReadPreference.secondaryPreferred());
//        return template;
//    }

    public @Bean(value = "writeMongo")
    MongoTemplate writeMongoInstance() {
        MongoTemplate template = new MongoTemplate(mongoDbFactory);
        return template;
    }

}
