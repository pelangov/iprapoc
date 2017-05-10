package com.pra.iprapoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class IprapocApplication {

	public static void main(String[] args) {
		SpringApplication.run(IprapocApplication.class, args);
	}
}
