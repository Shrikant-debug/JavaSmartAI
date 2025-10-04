package com.AI.Jarvis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.beans.BeanProperty;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JarvisApplication {

	public static void main(String[] args) {
		SpringApplication.run(JarvisApplication.class, args);
	}

}

