package com.javalei.demo;

import com.javalei.config.mongodbConfig;
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


@RunWith(SpringRunner.class)
@SpringBootTest
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

    @Test
    public void contextLoads2() {
        System.out.println(mongoClient);
    }


}
