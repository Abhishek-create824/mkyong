package com.mkyong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({ AppConfig.PACKAGE_CONFIG, AppConfig.PACKAGE_MODEL,
		AppConfig.PACKAGE_DAO, AppConfig.PACKAGE_BO })
@Import({ MongoConfig.class })
public class AppConfig {
	public static final String PACKAGE_CONFIG = "com.mkyong.config";
	public static final String PACKAGE_MODEL = "com.mkyong.model";
	public static final String PACKAGE_DAO = "com.mkyong.dao";
	public static final String PACKAGE_BO = "com.mkyong.bo";// HostingBo.class.getPackage().getName()
}