package com.lv.service;

import com.lv.pojo.User;

import java.util.List;

/**
 * Created by 14zr on 2019-03-22.
 */
public interface UserService {
    User getUser(Integer id);
    void addUser(User user);
    List<User> getAll();
    void deleteUser(Integer id);
    void updateUser(User user);
}
