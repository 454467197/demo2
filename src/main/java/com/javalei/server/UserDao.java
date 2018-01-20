package com.javalei.server;

import com.javalei.pojo.User;

public interface UserDao {
    int createuser();
    User selectByid(int id);
}
