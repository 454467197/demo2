package com.javalei.server.impl;

import com.javalei.server.Redis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class RedisImpl  implements Redis{

    //@Autowired
    //RedisTemplate redisTemplate;
    private Jedis jedis;

    @Override
    public long getId() {
        jedis=new Jedis("ecology9.com");
        jedis.auth("123456");
        //ValueOperations<String,Integer> valueOperations=  redisTemplate.opsForValue();
       //return  valueOperations.get("id");

        return  jedis.incr("id");
    }
}
