package com.example.miaosha.service;

import com.example.miaosha.dao.UserDao;
import com.example.miaosha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User getuserByid(int id){
        return  userDao.userByid(id);
    }

}
