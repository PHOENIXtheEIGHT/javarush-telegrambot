package com.github.phoenixtheeight.jrtb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.github.phoenixtheeight.jrtb",
		"org.telegram.telegrambots"
})
public class JavaRushTelegrambotApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRushTelegrambotApplication.class, args);
	}

}
