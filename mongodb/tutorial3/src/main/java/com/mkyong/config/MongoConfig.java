package com.mkyong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	public static final String HOST = "localhost";
	public static final int PORT = 27017;

	public static final String DATABASE = "mkyong";

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		MongoTemplate template = super.mongoTemplate();

		// show error, should off on production to speed up performance
		template.setWriteConcern(WriteConcern.SAFE);

		return template;
	}

	@Bean
	public GridFsTemplate gridFsTemplate() throws Exception {
		GridFsTemplate template = new GridFsTemplate(mongoDbFactory(),
				mappingMongoConverter());
		return template;
	}

	@Override
	protected String getDatabaseName() {
		return DATABASE;
	}

	@Override
	public Mongo mongo() throws Exception {
		MongoClient mongo = new MongoClient(HOST, PORT);
		return mongo;
	}

}