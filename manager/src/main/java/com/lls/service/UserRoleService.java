package com.lls.service;

import com.lls.pojo.UserRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author: Luke
 * @DateTime: 7/4/2022 11:47 AM
 * @Description: TODO
 */
public interface UserRoleService {

    List<Integer> queryUserRoles(Integer id);

    int addUserRoles(Map map);

    int deleteUserRoles(Map map);
}
