package com.lls.controller;

import com.lls.pojo.User;
import com.lls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {"/login","/"})
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(User user, Model model, HttpSession session) {

        User u = userService.login(user);

        if (u == null) {
            model.addAttribute("errorMsg", "用户名或者密码错误");
            return "redirect:login";
        }

        session.setAttribute("loginUser", u.getUsername());

        //if (role.equals("member")) {
        //    return "member";
        //}
        return "main";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }

}
