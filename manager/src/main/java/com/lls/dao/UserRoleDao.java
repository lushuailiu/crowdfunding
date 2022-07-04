package com.lls.dao;

import com.lls.pojo.UserRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author: Luke
 * @DateTime: 7/4/2022 2:20 PM
 * @Description: TODO
 */

public interface UserRoleDao {
    @Select("select role_id from t_user_role where user_id = #{id}")
    List<Integer> queryUserRoles(Integer id);

    int addUserRoles(Map map);

    int deleteUserRoles(Map map);
}
