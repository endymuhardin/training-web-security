package com.muhardin.endy.belajar.websecurity.controller;

import com.muhardin.endy.belajar.websecurity.dao.UserDao;
import com.muhardin.endy.belajar.websecurity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired private UserDao userDao;
    
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public Page<User> semuaUser(Pageable page){
        return userDao.findAll(page);
    } 
}
