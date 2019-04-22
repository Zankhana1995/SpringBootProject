package io.example.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//annotation will tell spring that this is a springboot class
public class CourseApiApp {

	public static void main(String[] args) {
		/*
		 * Tell springBoot that this is the Starting point of springboot application,
		 * and create servlet container and host this application in that servlet
		 * container and host this app on servlet and make it available.(by static method)
		 */
		SpringApplication.run(CourseApiApp.class, args);
		
	}

}
