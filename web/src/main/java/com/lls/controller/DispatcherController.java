package com.lls.controller;

import com.lls.pojo.User;
import com.lls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class DispatcherController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/pm/role",method = {RequestMethod.GET})
    public String role(){
        return "permission-management/role";
    }

    @RequestMapping(value = "/pm/user",method = {RequestMethod.GET})
    public String user(){
        return "permission-management/user";
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public String doLogin() {
        return "main";
    }

    @RequestMapping(value = "/pm/user/add",method = {RequestMethod.GET})
    public String userAdd(){
        return "permission-management/useradd";
    }

    @RequestMapping(value = "/pm/user/queryById",method = {RequestMethod.GET})
    public ModelAndView queryById(Integer id, ModelAndView modelAndView){
        User u = userService.queryById(id);
        modelAndView.setViewName("permission-management/userupdate");
        modelAndView.addObject("user",u);
        return modelAndView;
    }

}
