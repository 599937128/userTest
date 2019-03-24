package com.lv.controller;

import com.lv.pojo.User;
import com.lv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * Created by 14zr on 2019-03-22.
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(Integer id) {
        return "index";
    }

    @GetMapping("/getUser")
    public User getUser(Integer id) {
        return userService.getUser(id);
    }

    @GetMapping("/getAllUser")
    public ModelAndView getAllUser(Map map) {
        List<User> users = userService.getAll();
        map.put("users", users);
        return new ModelAndView("admin",map);
    }
    @GetMapping("/add")
    public String add(User user) {
        return "regist";
    }
    @PostMapping("/addUser")
    public String  addUser(User user) {
        userService.addUser(user);
        return "index";
    }

    @GetMapping("/update")
    public ModelAndView update(Integer id, Map map) {
        User user = userService.getUser(id);
        map.put("user",user);
        return new ModelAndView("update",map);
    }
    @PostMapping("/updateUser")
    public ModelAndView updateUser(Map map,User user) {
        userService.updateUser(user);
        List<User> users = userService.getAll();
        map.put("users", users);
        return new ModelAndView("admin",map);
    }

    @GetMapping("/deleteUser")
    public ModelAndView deleteUser(Map map,Integer id) {
        userService.deleteUser(id);
        List<User> users = userService.getAll();
        map.put("users", users);
        return new ModelAndView("admin",map);
    }
}
