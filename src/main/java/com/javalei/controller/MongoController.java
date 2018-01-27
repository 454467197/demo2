package com.javalei.controller;

import com.javalei.server.Mongodb;
import com.javalei.server.Redis;
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
    @Autowired
    Redis redis;



    @RequestMapping("/insert")

    public long  insertOne(@RequestParam Map<String,String> s){

        long id=redis.getId();
        s.put("id",id+"");
        s.put("complete","0");

        for (String s1 : s.keySet()) {
            System.out.println(s1);
            System.out.println(s.get(s1));
        }
        mongodb.insert(s);

        return id;

    }
    @RequestMapping("/delete")
    public long  delete(String  id){
         return mongodb.deleteOne(id);
    }
    @RequestMapping("/se")
    public List<Map<String,Object>> select(){
       return mongodb.select();

    }

}
