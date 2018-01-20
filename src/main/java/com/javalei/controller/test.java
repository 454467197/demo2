package com.javalei.controller;

import com.javalei.pojo.User;
import com.javalei.pojo.UserMybatis;
import com.javalei.server.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class test {
        @Autowired
        private UserDao userDao;
        @Autowired
        private UserMybatis userMybatis;
        @RequestMapping("/test")
        public  int  test(){
            return userDao.createuser();
        }
        @RequestMapping("/user")
        public User user(){
            User user=userMybatis.selectUserbyid(1);

            return  user;
        }
    }
