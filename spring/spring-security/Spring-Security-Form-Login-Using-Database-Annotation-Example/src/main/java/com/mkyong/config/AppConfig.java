package com.mkyong.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
 
@EnableWebMvc
@Configuration
@ComponentScan({ "com.mkyong.web.*" })
@Import({ SecurityConfig.class })
public class AppConfig {
		
	@Bean(name = "dataSource")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource dataSource = createDataSource();
        DatabasePopulatorUtils.execute(createDatabasePopulator(), dataSource);
        return dataSource;
    }
		
	private DriverManagerDataSource createDataSource() {
	    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
	    driverManagerDataSource.setDriverClassName("org.hsqldb.jdbcDriver");
	    driverManagerDataSource.setUrl("jdbc:hsqldb:file:~/desenv/github/mkyong/temp/h2/Spring-Security-Form-Login-Using-Database-Annotation-Example;sql.syntax_ora=true");
	    driverManagerDataSource.setUsername("sa");
	    driverManagerDataSource.setPassword("");
	    return driverManagerDataSource;
	}
	
	private DatabasePopulator createDatabasePopulator() {
        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
        databasePopulator.setContinueOnError(true);
        databasePopulator.addScript(new ClassPathResource("ddl.sql"));
		databasePopulator.addScript(new ClassPathResource("dml.sql"));
        return databasePopulator;
    }

 
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver 
                          = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	} 
}