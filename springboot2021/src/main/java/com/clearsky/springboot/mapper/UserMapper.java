package com.clearsky.springboot.mapper;

import com.clearsky.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    User findById(Integer id);
    void add(User user);
    void update(User user);
    void del(User user);
}
