package com.javalei.server.impl;

import com.javalei.config.mongodbConfig;
import com.javalei.server.Mongodb;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class MongoImpl implements Mongodb{

    private MongoCollection<Document> mongoCollection= mongodbConfig.getClient().getDatabase("zzw").getCollection("u");

    @Override
    public void insert(Map<String, String> map) {
        Document d=new Document();
        for(String s:map.keySet()){
            d.append(s,map.get(s));
        }
        mongoCollection.insertOne(d);

    }

    @Override
    public List<Map<String, Object>> select() {
        return select(new ArrayList<>());
    }

    @Override
    public List<Map<String, Object>> select(List<Map<String, Object>> list) {

        FindIterable<Document> findIterable= mongoCollection.find();
        Block<Document> block=new Block<Document>() {
            @Override
            public void apply(Document document) {
                HashMap<String,Object> map=new HashMap<String,Object>();
                map.putAll(document);
                map.remove("_id");
                list.add(map);
            }
        };

        findIterable.forEach(block);

        return list;
    }

    @Override
    public void delete(List list) {

    }
}
