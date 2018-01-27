package com.javalei.demo;

import com.javalei.config.mongodbConfig;
import com.javalei.server.Redis;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import static com.mongodb.client.model.Filters.*;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.sound.midi.SoundbankResource;
import java.util.HashMap;
import java.util.Map;


//@RunWith(SpringRunner.class)
//@SpringBootTest
 public class DemoApplicationTests {

	private MongoClient mongoClient= mongodbConfig.getClient();

	private  MongoCollection mongoCollection;
	@Test
	public void contextLoads() {
	MongoDatabase md= mongoClient.getDatabase("zzw");
        System.out.println("md"+md);

        MongoCollection<org.bson.Document> coll=md.getCollection("u");
        Block bl=new Block() {
            @Override
            public void apply(Object o) {
                System.out.println(o);

            }
        };

        FindIterable fi=  coll.find();
        //fi.forEach(bl);
        org.bson.Document tDocument=new org.bson.Document();
        tDocument.append("name","无验证组");
        tDocument.append("id",128);
        coll.insertOne(tDocument);
        fi.forEach(bl);

	}

	private Jedis jedis ;

    @Test
    public void contextLoads2() {
        jedis=new Jedis("ecology9.com");
        jedis.auth("123456");
        jedis.hset("user","username","zhangzw");
        Map<String,String> map=new HashMap<>();
        map.put("sysadmin","1");
        map.put("admin","admin");
        map.put("sysadmin2","sysadmin2");
        jedis.hmset("user1",map);
        System.out.println(jedis.hexists("user1","sysadmin"));
        System.out.println(jedis.keys("*"));


    }
    @Autowired
    private Redis redis;

    @Test
    public  void redisTest(){

    }


}
