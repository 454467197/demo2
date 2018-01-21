package com.javalei.server;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface Mongodb {
     void insert(Map<String,Object> map);

     List<Map<String,Object>> select();

     void delete(List list);
}
