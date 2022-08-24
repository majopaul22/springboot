package com.example.sping.redis;

import com.example.sping.redis.dto.Product;
import com.example.sping.redis.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
public class SpingbootRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingbootRedisApplication.class, args);
	}

}
