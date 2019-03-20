package com.byyuengc.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byyuengc.api.entity.MongoUser;
import com.byyuengc.api.entity.User;
import com.byyuengc.api.service.UserService;

@RestController
public class TestApiController {

    @Autowired
    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;
    

    @RequestMapping("/getall")
    public List<User> getAll() {
        return userService.findUserList();
    }
    
    @RequestMapping("/adduser")
    public int addUser() {
        String mobile = "***";
        double cash = 11.5;
        double cashGift = 12.5;
        int role = 1;
        int status = 1;
        int created = 1553054059;
        int updated = 1553054059;
        return userService.insertUser(mobile, cash, cashGift, role, status, created, updated);
    }
    
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/")
    public String index() {
        return "This is test,I m test Server and port:"+serverPort;
    }
    
    @RequestMapping("/mongo/getall")
    public String mongoAll() {
        List<MongoUser> userList = mongoTemplate.findAll(MongoUser.class);
        return userList.get(0).toString();
    }
    
}

