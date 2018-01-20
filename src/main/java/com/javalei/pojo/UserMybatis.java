package com.javalei.pojo;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMybatis {

    @Select("select * from user where id=#{id}")
    User selectUserbyid(int id);
    

}
