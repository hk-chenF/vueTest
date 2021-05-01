package com.chen.dao;

import com.chen.domian.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//持久层接口
public interface IUserDao {
    /**
     * 查询用户列表
     */
    //查询所有
    @Select("select * from user2")
    List<User> findAll();

    //根据id查询
    @Select("select * from user2 where id = #{userId}")
    User findById(Integer userId);

    //更新
    @Update("update user2 set username=#{username},password=#{password},age=#{age}," +
            "sex=#{sex},email=#{email} where id=#{id}")
    void updateUser( User user);
}
