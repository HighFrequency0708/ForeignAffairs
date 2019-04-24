package com.dapain.foreignAffairs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages= {"com.dapain.foreignAffairs","com.ibeetl.admin"})
public class MainApplication  extends SpringBootServletInitializer implements WebApplicationInitializer {
	
    public static void main(String[] args) {
    	
    	SpringApplication.run(MainApplication.class, args);
    }



}	