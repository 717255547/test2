package com.liutestapp.lcmtestapp2.dao;

import com.liutestapp.lcmtestapp2.entity.User;
import com.liutestapp.lcmtestapp2.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface IUserDao extends UserMapper {
    List<User> findByName(@Param("userName") String username);

    User selectById(@Param("id") Integer id);
}