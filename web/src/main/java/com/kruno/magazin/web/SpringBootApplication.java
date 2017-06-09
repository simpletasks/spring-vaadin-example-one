package com.kruno.magazin.web;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
// needed for running on the wildfly server
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"hr.kruno.magazin"})
@EnableJpaRepositories(basePackages = {"hr.kruno.magazin"})
@EntityScan({"hr.kruno.magazin"})
@Order(2)
// XXX when JPA setup is done. 'Exclude' is not needed any more.
@EnableAutoConfiguration//(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@PropertySource("classpath:application.properties")  // XXX is this needed ??
// XXX or annotation ?
//@SpringBootApplication
public class SpringBootApplication extends SpringBootServletInitializer {


	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		application.sources(MyVendorAdapter.class);
		application.sources(SpringBootApplication.class);
		return application;
		
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}
}
