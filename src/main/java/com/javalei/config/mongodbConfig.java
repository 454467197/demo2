package com.javalei.config;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class mongodbConfig {


    @Bean
    public static MongoClient getClient(){
        List<ServerAddress> list=new ArrayList<>();
        list.add(new ServerAddress("192.168.1.109"));
        list.add(new ServerAddress("106.14.114.211"));
        list.add(new ServerAddress("106.14.113.242"));

        return new MongoClient(list);
    }


}
