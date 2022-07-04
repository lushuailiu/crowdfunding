package com.lls.controller;

import com.lls.pojo.Page;
import com.lls.pojo.Role;
import com.lls.service.RoleService;
import com.lls.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController {


    @Autowired
    RoleService roleService;

    @Autowired
    UserRoleService userRoleService;

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

    @RequestMapping(value = "/addrole", method = RequestMethod.POST)
    @ResponseBody
    public void addRole(Role role) {
        roleService.addRole(role);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(Integer id) {
        return roleService.deleteById(id);
    }

    @RequestMapping(value = "/deleteMore", method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteMore(@RequestParam("ids[]") Integer[] ids) {
        return roleService.deleteMore(ids);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public int update(@RequestBody Role role) {
        return roleService.Update(role);
    }

    @RequestMapping(value = "/assignRoles", method = RequestMethod.POST)
    @ResponseBody
    public int assignRoles(@RequestParam("roles[]") Integer[] roles,Integer id){
        Map map = new HashMap();
        map.put("id", id);
        map.put("roles", roles);

        int i = userRoleService.addUserRoles(map);
        return i;
    }

    @RequestMapping(value = "/unassignRoles", method = RequestMethod.POST)
    @ResponseBody
    public int unassignRoles(@RequestParam("roles[]") Integer[] roles,Integer id){
        Map map = new HashMap();
        map.put("id", id);
        map.put("roles", roles);

        int i = userRoleService.deleteUserRoles(map);
        return i;
    }
}
