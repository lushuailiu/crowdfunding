package com.lls.service.impl;

import com.lls.dao.UserRoleDao;
import com.lls.pojo.UserRole;
import com.lls.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Luke
 * @DateTime: 7/4/2022 2:19 PM
 * @Description: TODO
 */
@Service
public class UserRoleImpl implements UserRoleService {

    @Autowired
    UserRoleDao userRoleDao;

    public List<Integer> queryUserRoles(Integer id) {
        return userRoleDao.queryUserRoles(id);
    }

    public int addUserRoles(Map map) {
        return userRoleDao.addUserRoles(map);
    }

    public int deleteUserRoles(Map map) {
        return userRoleDao.deleteUserRoles(map);
    }
}
