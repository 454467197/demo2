package com.javalei.controller;

import com.javalei.server.Redis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class redisController {
    @Autowired
    Redis redis;


    @RequestMapping("/task")
    public int getTask(String s){
        System.out.println(s);

        return  0;
    }

    @RequestMapping("/getid")
    public long getid(){

        return redis.getId();
    }



}
