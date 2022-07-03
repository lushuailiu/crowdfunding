package com.lls.dao;

import com.lls.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {
    @Select("select * from t_user")
    List<User> queryAll();


    @Select("select * from t_user where loginacct=#{loginacct} limit 1")
    User queryByLoginAcct(User user);

    @Select("select * from t_user limit #{startNo},#{pageSize}")
    List<User> queryWithPage(@Param("startNo") Integer startNo, @Param("pageSize") Integer pageSize);

    @Select("select count(1) from t_user")
    int queryCount();

    List<User> queryFuzzy(Map map);

    int queryFuzzyCount(Map map);


    void insertUser(User user);

    int deleteById(Integer id);

    int deleteMore(Integer[] ids);

    int updateUser(User user);

    User queryById(Integer id);
}
