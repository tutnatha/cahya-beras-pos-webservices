package com.course.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
//public class CourseApiApp extends SpringBootServletInitializer {
public class CourseApiApp{
	//Remark dulu..
/* buka lagi */ 
//	@Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(CourseApiApp.class);
//    }
/* end buka */
    public static void main(String[] args) {

        SpringApplication.run(CourseApiApp.class, args);

    }

}
