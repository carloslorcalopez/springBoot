package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	private UserRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
	}
	
	@Bean
	InitializingBean sendDatabase() {
	    return () -> {
	    	User pablo = new User();
	    	pablo.setEmail("pablocan@hotmail.com");
			pablo.setLogin("pablo");
			pablo.setName("Pablo Can");
			pablo.setPassword("secreto");
			pablo.setVeces(1000);
			repository.save(pablo);
			pablo = new User();
	    	pablo.setEmail("carlos@hotmail.com");
			pablo.setLogin("carlos");
			pablo.setName("Carlos Can");
			pablo.setPassword("secreto");
			pablo.setVeces(1000);
			repository.save(pablo);
	      };
	   }
}
