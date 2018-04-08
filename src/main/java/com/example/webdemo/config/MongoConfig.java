package com.example.webdemo.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Component;

/**
 * @author lijie7
 * @date 2018/4/8
 * @Description
 * @modified By
 */
@Component
@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MongoConfig {
    private final Logger log = LoggerFactory.getLogger(MongoConfig.class);
    @Value("${spring.data.mongodb.uri}")
    private String mongoUrl;
    @Value("${spring.data.mongodb.database}")
    private String database;


    public @Bean(value = "mongoFactory")
    MongoDbFactory mongoDbFactory() throws Exception {
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(new MongoClient(new MongoClientURI(mongoUrl)), database);
        return mongoDbFactory;
    }
}
