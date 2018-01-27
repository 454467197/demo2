package com.javalei.server;

import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface Mongodb {
     void insert(Map<String,String> map);

     List<Map<String,Object>> select();
     List<Map<String,Object>> select(List<Map<String,Object>> list);
     void delete(List list);
     long deleteOne(String id);
}
