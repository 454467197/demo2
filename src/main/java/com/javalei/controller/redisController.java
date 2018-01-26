package com.javalei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class redisController {
    @RequestMapping("/task")
    public int getTask(String s){
        System.out.println(s);

        return  0;
    }



}
