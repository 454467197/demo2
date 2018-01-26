package com.javalei.server.impl;

import com.javalei.server.Redis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisImpl  implements Redis{

    @Autowired
    RedisTemplate<String,Integer> redisTemplate;

    @Override
    public int getId() {

        return 0;
    }
}
