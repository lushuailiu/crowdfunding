package com.lls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DispatcherController {

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

}
