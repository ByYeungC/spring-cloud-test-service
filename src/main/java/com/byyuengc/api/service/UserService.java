package com.byyuengc.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.byyuengc.api.entity.User;
import com.byyuengc.api.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class UserService {
        @Autowired
        private UserMapper users;
    
        public List<User> findUserList() {
            log.info("#####################all users ############");
        return users.findAll();
    }
    
    @Transactional
    public int insertUser(String mobile, double cash, double cashGift, int role, int status, int created, int updated) {
        int insertUserResult = users.insert(mobile, cash, cashGift, role, status, created, updated);
        return insertUserResult;
    }
}
