package com.raul.block5profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.concurrent.ConcurrentMap;

@SpringBootApplication
public class Block5ProfilesApplication {
	@Autowired
	private static Environment env;

	public static void main(String[] args) {

		SpringApplication.run(Block5ProfilesApplication.class, args);

		String[] perfiles = env.getActiveProfiles();


			System.out.println(perfiles);


	}


}
