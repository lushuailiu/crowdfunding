package com.lls.controller;

import com.lls.pojo.Role;
import com.lls.pojo.User;
import com.lls.pojo.UserRole;
import com.lls.service.RoleService;
import com.lls.service.UserRoleService;
import com.lls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class DispatcherController {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    UserRoleService userRoleService;

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
    public ModelAndView userQueryById(Integer id, ModelAndView modelAndView){
        User u = userService.queryById(id);
        modelAndView.setViewName("permission-management/userupdate");
        modelAndView.addObject("user",u);
        return modelAndView;
    }


    //for role
    @RequestMapping(value = "/pm/role/add",method = {RequestMethod.GET})
    public String roleAdd(){
        return "permission-management/roleadd";
    }

    @RequestMapping(value = "/pm/role/queryById",method = {RequestMethod.GET})
    public ModelAndView roleQueryById(Integer id, ModelAndView modelAndView){
        Role role = roleService.queryById(id);
        modelAndView.setViewName("permission-management/roleupdate");
        modelAndView.addObject("role",role);
        return modelAndView;
    }

    @RequestMapping(value = "/pm/role/assignRole",method = {RequestMethod.GET})
    public ModelAndView roleAdd(Integer id,ModelAndView modelAndView){

        List<Role> roles = roleService.queryAll();
        List<Integer> userRoles = userRoleService.queryUserRoles(id);

        List<Role> assignRoles = roles.stream().filter(role -> userRoles.contains(role.getId())).collect(Collectors.toList());

        roles.removeAll(assignRoles);

        modelAndView.setViewName("permission-management/assignRole");
        modelAndView.addObject("assignRoles", assignRoles);
        modelAndView.addObject("unassignRoles", roles);
        modelAndView.addObject("id", id);

        return modelAndView;
    }


}
