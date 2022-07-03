package com.lls.service;

import com.lls.pojo.Page;
import com.lls.pojo.Role;

import java.util.List;

public interface RoleService {
    List<Role> queryAll();

    Page<Role> queryWithPage(Integer pageNo, Integer pageSize);

    Page<Role> queryFuzzy(String loginAcct, Integer pageNo, Integer pageSize);


    void addRole(Role role);

    int deleteById(Integer id);

    int deleteMore(Integer[] ids);

    int Update(Role role);

    Role queryById(Integer id);
}
