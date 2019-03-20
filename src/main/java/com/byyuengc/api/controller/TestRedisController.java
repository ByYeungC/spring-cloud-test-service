package com.byyuengc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRedisController {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    
    @RequestMapping("/testRedis") 
    public String testRedis() {
        redisTemplate.opsForValue().set("TEST", "Test Redis");
//      redisTemplate.opsForValue().set("HELLO", "hello",10, TimeUnit.SECONDS);
        String str = (String) redisTemplate.opsForValue().get("TEST");
//      redisTemplate.opsForValue().getOperations().delete("hello");
        return "Test Redis"+str;
    }
}
