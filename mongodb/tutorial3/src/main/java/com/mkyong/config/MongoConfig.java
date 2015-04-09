package com.mkyong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

@Configuration
public class MongoConfig {

	public @Bean MongoDbFactory mongoDbFactory() throws MongoException {
		MongoClient mongo = new MongoClient("localhost");
		SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(
				mongo, "mkyong");
		return simpleMongoDbFactory;
	}

	public @Bean MongoTemplate mongoTemplate() throws MongoException {
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

		// show error, should off on production to speed up performance
		mongoTemplate.setWriteConcern(WriteConcern.SAFE);

		return mongoTemplate;
	}

}