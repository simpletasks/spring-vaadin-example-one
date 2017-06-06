package com.kruno.magazin.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
// needed for running on the wildfly server
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.kruno.magazin"})
//@EnableJpaRepositories({"com.kruno.magazin"})
//@EntityScan({"com.kruno.magazin"})
public class SpringBootApplication extends SpringBootServletInitializer {

}
