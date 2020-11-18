package com.excise.crm.setting.controller;

import com.excise.crm.setting.bean.User;
import com.excise.crm.setting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description: TODO
 * @author: FLY
 * @date: 2020/11/18 9:59
 * @version: v1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryUsers")
    @ResponseBody
    public List<User> queryUsers(){


        return userService.queryUsers();
    }
}
