package com.timeline.timeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TimelineApplication {
	
	@RequestMapping("/")
	public String index () {
		return "Springboot Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(TimelineApplication.class, args);
	}

}
