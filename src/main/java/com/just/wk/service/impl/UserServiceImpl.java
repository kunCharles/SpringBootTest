package com.just.wk.service.impl;

import com.just.wk.service.UserService;
import com.just.wk.model.User;
import com.just.wk.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public User getUserById(int id) {
        return mapper.getUserById(id);
    }
}