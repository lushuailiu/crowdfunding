package com.lls.service;

import com.lls.pojo.Page;
import com.lls.pojo.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();

    User login(User user);

    Page<User> queryWithPage(Integer pageNo, Integer pageSize);

    Page<User> queryFuzzy(String loginAcct,Integer pageNo, Integer pageSize);


    void addUser(User user);

    int deleteById(Integer id);

    int deleteMore(Integer[] ids);

    int Update(User user);

    User queryById(Integer id);
}
