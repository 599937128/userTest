package com.lv.service.impl;

import com.lv.mapper.UserMapper;
import com.lv.pojo.User;
import com.lv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 14zr on 2019-03-22.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAllUser();
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
