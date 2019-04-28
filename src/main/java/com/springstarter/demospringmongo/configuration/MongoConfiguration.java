package com.springstarter.demospringmongo.configuration;


import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfiguration {

    @Bean
    public MongoClient mongoClient() {
        return new MongoClient("mongodb", 27017);
    }
}
