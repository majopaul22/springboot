package com.example.sping.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@RedisHash("Product")
public class Product implements Serializable {
    @Id
    private int id;
    private String name;
    private long price;
    private int quantity;
}
