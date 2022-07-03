package com.lls.controller;

import com.lls.pojo.Page;
import com.lls.pojo.Role;
import com.lls.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/role")
public class RoleController {



    @Autowired
    RoleService roleService;

    @RequestMapping("/roleList1")
    @ResponseBody
    public Page<Role> roleList1(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<Role> pageList = roleService.queryWithPage(pageNo, pageSize);
        return pageList;
    }

    @RequestMapping("/roleList2")
    @ResponseBody
    public Page<Role> roleList2(@RequestParam(value = "role", required = false) String role,
                                @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<Role> pageList = roleService.queryFuzzy(role, pageNo, pageSize);
        return pageList;
    }

    @RequestMapping(value = "/addrole",method = RequestMethod.POST)
    @ResponseBody
    public void addRole( Role role) {
        roleService.addRole(role);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(Integer id){
        return roleService.deleteById(id);
    }

    @RequestMapping(value = "/deleteMore",method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteMore(@RequestParam("ids[]") Integer[] ids){
        return roleService.deleteMore(ids);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public int update(@RequestBody Role role){
        return roleService.Update(role);
    }
}
