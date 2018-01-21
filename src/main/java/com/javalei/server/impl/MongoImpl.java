package com.javalei.server.impl;

import com.javalei.config.mongodbConfig;
import com.javalei.server.Mongodb;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;
@Service
public class MongoImpl implements Mongodb{

    private MongoCollection<Document> mongoCollection= mongodbConfig.getClient().getDatabase("zzw").getCollection("uy");

    @Override
    public void insert(Map<String, Object> map) {
        Document d=new Document();
        for(String s:map.keySet()){
            d.append(s,map.get(s));
        }
        mongoCollection.insertOne(d);

    }

    @Override
    public List<Map<String, Object>> select() {
        return null;
    }

    @Override
    public void delete(List list) {

    }
}
