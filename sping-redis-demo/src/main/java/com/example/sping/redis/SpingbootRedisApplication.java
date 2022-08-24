package com.example.sping.redis;

import com.example.sping.redis.entity.Product;
import com.example.sping.redis.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/product")
public class SpingbootRedisApplication {
	@Autowired
	private ProductDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpingbootRedisApplication.class, args);
	}

	@PostMapping
	public Product save(@RequestBody Product product) {
		return dao.save(product);
	}

	@GetMapping
	public List<Product> getAll() {
		return dao.getProducts();
	}

	@GetMapping("/{id}")
	public Product findProductById(@PathVariable int id) {
		return dao.findProductById(id);
	}
}
