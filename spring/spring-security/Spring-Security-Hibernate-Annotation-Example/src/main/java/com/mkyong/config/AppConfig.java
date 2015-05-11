package com.mkyong.config;
 
import java.util.Properties;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
 
@EnableWebMvc
@Configuration
@ComponentScan({ "com.mkyong.*" })
@EnableTransactionManagement
@Import({ SecurityConfig.class })
public class AppConfig {
	
	@Bean(name = "dataSource")
    public BasicDataSource getDataSource(){
	    BasicDataSource ds = new BasicDataSource();
	    ds.setDriverClassName("org.hsqldb.jdbcDriver");
	    ds.setUrl("jdbc:hsqldb:file:~/desenv/github/mkyong/temp/hsqldb/Spring-Security-Hibernate-Annotation-Example");
	    ds.setUsername("sa");
	    ds.setPassword("");
	    return ds;
	}
	
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory() {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(getDataSource());
		builder.scanPackages("com.mkyong.users.model").addProperties(getHibernateProperties());

		return builder.buildSessionFactory();
	}
 
	private Properties getHibernateProperties() {
		Properties prop = new Properties();
		prop.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
		prop.put("hibernate.hbm2ddl.auto", "create");
		prop.put("hibernate.format_sql", "true");
		prop.put("hibernate.show_sql", "true");
		
		return prop;
	}	
	
	//Create a transaction manager
	@Bean(name = "txManager")
    public HibernateTransactionManager getTxManager() {
		return new HibernateTransactionManager(getSessionFactory());
	}
	 
	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver 
                          = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	} 
}