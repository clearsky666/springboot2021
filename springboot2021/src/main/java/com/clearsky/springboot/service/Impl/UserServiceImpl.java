package com.clearsky.springboot.service.Impl;

import com.clearsky.springboot.entity.User;
import com.clearsky.springboot.mapper.UserMapper;
import com.clearsky.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> findAll(){
        return userMapper.findAll();
    }
    @Override
    public User findById(Integer id){
        return userMapper.findById(id);
    }
    @Override
    public String add(User user){
        try {
            userMapper.add(user);
            return "ok";
        }catch (Exception e){

            return "error";
        }
    }
    @Override
    public String update(User user){
        try {
            userMapper.update(user);
            return "ok";
        }catch (Exception e){
            log.error(e+"");
            return "error";
        }
    }
    @Override
    public String del(User user){
        try {
            userMapper.del(user);
            return "ok";
        }catch (Exception e){
            log.error(e+"");
            return "error";
        }
    }
}
