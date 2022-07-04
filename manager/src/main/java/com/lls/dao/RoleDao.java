package com.lls.dao;

import com.lls.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface RoleDao {
    @Select("select * from t_role")
    List<Role> queryAll();


    @Select("select * from t_role where loginacct=#{loginacct} limit 1")
    Role queryByLoginAcct(Role Role);

    @Select("select * from t_role limit #{startNo},#{pageSize}")
    List<Role> queryWithPage(@Param("startNo") Integer startNo, @Param("pageSize") Integer pageSize);

    @Select("select count(1) from t_role")
    int queryCount();

    List<Role> queryFuzzy(Map map);

    int queryFuzzyCount(Map map);


    void insertRole(Role Role);

    int deleteById(Integer id);

    int deleteMore(Integer[] ids);

    int updateRole(Role Role);

    Role queryById(Integer id);
}
