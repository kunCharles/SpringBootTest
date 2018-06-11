package com.just.wk.controller;

import com.just.wk.model.User;
import com.just.wk.service.UserService;
import com.alibaba.fastjson.JSONArray;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        User user = userService.getUserById(id);
        if(user!=null){
            logger.info(JSONArray.toJSON(user));
        }
        return user;
    }
}