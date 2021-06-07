package com.example.icf.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class JDBCconfig {
	
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String dbUsername;
	
	@Value("${spring.datasource.password}")
	private String dbPassword;
	
	@Bean
	public JdbcTemplate getjdbctemplate() {
		
		return new JdbcTemplate(getdataSource());
	}
	
	public DataSource getdataSource()
	{
		  DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 
		  dataSource.setDriverClassName(driverClassName);
		 
		  dataSource.setUrl(url);
		 
		  dataSource.setUsername(dbUsername);
		 
		  dataSource.setPassword(dbPassword);
		 
		  return dataSource;
	}

}
