package com.javalei.controller;

import com.javalei.server.Mongodb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MongoController {
    @Autowired
    private Mongodb mongodb;

    @RequestMapping("/insert")

    public void  insertOne(@RequestParam Map<String,String> s){
        System.out.println("进入了insertone");
        System.out.println(s);
        for (String s1 : s.keySet()) {
            System.out.println(s1);
            System.out.println(s.get(s1));
        }

        mongodb.insert(s);

    }
    @RequestMapping("/insert1")
    public int  insertOne(String  text){
        System.out.println("进入了insertone2");
        System.out.println(text);

        return 1;
    }
    @RequestMapping("/se")
    public List<Map<String,Object>> select(){
       return mongodb.select();

    }

}
