package com.lls.controller;

import com.lls.pojo.Page;
import com.lls.pojo.User;
import com.lls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("/userList1")
    @ResponseBody
    public Page<User> userList1(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<User> pageList = userService.queryWithPage(pageNo, pageSize);
        return pageList;
    }

    @RequestMapping("/userList2")
    @ResponseBody
    public Page<User> userList2(@RequestParam(value = "loginAcct", required = false) String loginAcct,
                                @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<User> pageList = userService.queryFuzzy(loginAcct, pageNo, pageSize);
        return pageList;
    }

    @RequestMapping(value = "/adduser",method = RequestMethod.POST)
    @ResponseBody
    public void addUser( User user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(Integer id){
        return userService.deleteById(id);
    }

    @RequestMapping(value = "/deleteMore",method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteMore(@RequestParam("ids[]") Integer[] ids){
        return userService.deleteMore(ids);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @ResponseBody
    public int update(User user){
        return userService.Update(user);
    }
}
