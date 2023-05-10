package com.example.Ecommerce.platform.Service;

import Models.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    Users users;

    public void saveUser(Users users){


    }
}
