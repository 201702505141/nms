package com.example.miaosha.controller;

import com.example.miaosha.domain.User;
import com.example.miaosha.redis.RedisSevice;
import com.example.miaosha.redis.UserKey;
import com.example.miaosha.result.Result;
import com.example.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/demo")
public class SimpleController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","joshua");
        return  "hello";


    }

    @Autowired
    UserService userService;


    @RequestMapping("/db/get")
    @ResponseBody
    public Result<User> dbGet (){
        User user=userService.getuserByid(1);
        return Result.success(user);
    }

    @Autowired
    RedisSevice redisSevice;

    @RequestMapping("/redis/get")
    @ResponseBody
    public Result<User> reGet (){
//        Long v1=redisSevice.get(UserKey.getById,"key1",Long.class);
//        return Result.success(v1);
        User user=redisSevice.get(UserKey.getById,""+1,User.class);

        return Result.success(user);
    }

    @RequestMapping("/redis/set")
    @ResponseBody
    public Result<Boolean> reSet (){
//        boolean ret=redisSevice.set(UserKey.getById,"key2","hello,imooc");
//        String str=redisSevice.set(UserKey.getByName,"key2",String.class);
//        return Result.success(str);
        User user=new User();
        user.setId(1);
        user.setName("111");
        Boolean str=redisSevice.set(UserKey.getById,""+1,user);
        return  Result.success(true);
    }


}


