package com.lls.service.impl;

import com.lls.dao.RoleDao;
import com.lls.pojo.Page;
import com.lls.pojo.Role;
import com.lls.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao roleDao;

    public List<Role> queryAll() {

        return roleDao.queryAll();
    }


    public Page<Role> queryWithPage(Integer pageNo, Integer pageSize) {

        Page<Role> RolePage = new Page<Role>();

        Integer startNo = (pageNo - 1) * pageSize;
        List<Role> RoleList = roleDao.queryWithPage(startNo, pageSize);

        int c = roleDao.queryCount();
        double count = c + 0.0;

        RolePage.setList(RoleList);
        RolePage.setPageNo(pageNo);
        RolePage.setPageSize(pageSize);
        RolePage.setTotalNo(c);
        RolePage.setTotalPage((int) Math.ceil((count) / pageSize));
        return RolePage;
    }

    public Page<Role> queryFuzzy(String role, Integer pageNo, Integer pageSize) {

        Page<Role> RolePage = new Page<Role>();

        Integer startNo = (pageNo - 1) * pageSize;

        Map map = new HashMap();
        map.put("role", role);
        map.put("startNo", startNo);
        map.put("pageSize", pageSize);
        List<Role> RoleList = roleDao.queryFuzzy(map);

        int c = roleDao.queryFuzzyCount(map);
        double count = c + 0.0;

        RolePage.setList(RoleList);
        RolePage.setPageNo(pageNo);
        RolePage.setPageSize(pageSize);
        RolePage.setTotalNo(c);
        RolePage.setTotalPage((int) Math.ceil((count) / pageSize));
        return RolePage;
    }

    public void addRole(Role Role) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createDate = simpleDateFormat.format(date);
        Role.setCreatedate(createDate);

        roleDao.insertRole(Role);
    }

    public int deleteById(Integer id) {
       return roleDao.deleteById(id);
    }

    public int deleteMore(Integer[] ids) {
        int num = roleDao.deleteMore(ids);
        return num;
    }

    public int Update(Role role) {
        return roleDao.updateRole(role);
    }

    public Role queryById(Integer id) {
        return roleDao.queryById(id);
    }

}
