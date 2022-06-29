package com.lls.service.impl;

import com.lls.dao.UserDao;
import com.lls.pojo.Page;
import com.lls.pojo.User;
import com.lls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public List<User> queryAll() {

        return userDao.queryAll();
    }

    public User login(User user) {
        User u = userDao.queryByLoginAcct(user);

        if (u != null && user.getPassword().equals(u.getPassword())) {
            return u;
        }
        return null;
    }

    public Page<User> queryWithPage(Integer pageNo, Integer pageSize) {

        Page<User> userPage = new Page<User>();

        Integer startNo = (pageNo - 1) * pageSize;
        List<User> userList = userDao.queryWithPage(startNo, pageSize);

        int c = userDao.queryCount();
        double count = c + 0.0;

        userPage.setList(userList);
        userPage.setPageNo(pageNo);
        userPage.setPageSize(pageSize);
        userPage.setTotalNo(c);
        userPage.setTotalPage((int) Math.ceil((count) / pageSize));
        return userPage;
    }

    public Page<User> queryFuzzy(String loginAcct, Integer pageNo, Integer pageSize) {

        Page<User> userPage = new Page<User>();

        Integer startNo = (pageNo - 1) * pageSize;

        Map map = new HashMap();
        map.put("loginAcct", loginAcct);
        map.put("startNo", startNo);
        map.put("pageSize", pageSize);
        List<User> userList = userDao.queryFuzzy(map);

        int c = userDao.queryFuzzyCount(map);
        double count = c + 0.0;

        userPage.setList(userList);
        userPage.setPageNo(pageNo);
        userPage.setPageSize(pageSize);
        userPage.setTotalNo(c);
        userPage.setTotalPage((int) Math.ceil((count) / pageSize));
        return userPage;
    }

    public void addUser(User user) {
        user.setPassword("123456");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createDate = simpleDateFormat.format(date);
        user.setCreatedate(createDate);

        userDao.insertUser(user);
    }
}
