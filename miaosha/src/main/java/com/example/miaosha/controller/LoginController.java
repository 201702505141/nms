package com.example.miaosha.controller;

import com.example.miaosha.result.Result;
import com.example.miaosha.service.UserService;
import com.example.miaosha.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    private static Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/to_login")
    @ResponseBody
    public String tologin(){
        return "login";
    }

    @RequestMapping("/do_login")
    @ResponseBody
    public Result<Boolean> dologin(LoginVo loginVo) {
        
        return null;
    }

    @RequestMapping("/hello/thymeleaf")
    @ResponseBody
    public String themaleaf(Model modela){
        modela.addAttribute("name","as");
        return "hello";
    }


}
