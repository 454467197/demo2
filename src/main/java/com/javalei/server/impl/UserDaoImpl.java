package com.javalei.server.impl;

import com.javalei.pojo.User;
import com.javalei.server.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate   jdbcTemplate;

    @Override
    public int createuser() {

        return  jdbcTemplate.update("insert into user VALUES(null,?,?)","wuyaznzu",18);

    }

    @Override
    public User selectByid(int id) {
         return new User();
    }
}
