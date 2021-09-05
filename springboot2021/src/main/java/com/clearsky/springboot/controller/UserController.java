package com.clearsky.springboot.controller;

import com.clearsky.springboot.entity.User;
import com.clearsky.springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @RequestMapping("findById")
    public User findById(Integer id){
        return userService.findById(id);
    }
    @RequestMapping("/add")
    public String add(User user){
        return userService.add(user);
    }
    @RequestMapping("/update")
    public String update(User user){
        return userService.update(user);
    }
    @RequestMapping("/del")
    public String del(User user){
        return userService.del(user);
    }
}
