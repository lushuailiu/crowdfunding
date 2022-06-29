package com.lls.controller;

import com.lls.pojo.User;
import com.lls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String test(){
        return "index";
    }


    @ResponseBody
    @RequestMapping("/json")
    public Object json(){
        Map<Object, Object> map = new HashMap<>();
        map.put("username", "tt");
        return map;
    }

    @RequestMapping("/all")
    @ResponseBody
    public Object queryAll(){
        List<User> list = userService.queryAll();
        return list;
    }

}
