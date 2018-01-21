package com.javalei.controller;

import com.javalei.server.Mongodb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MongoController {
    @Autowired
    private Mongodb mongodb;

    @RequestMapping("/insert")

    public void  insertOne(String s){
        System.out.println("进入了insertone");
        System.out.println(s);

    }
}
