package com.excise.crm.setting.service.impl;

import com.excise.crm.setting.bean.User;
import com.excise.crm.setting.mapper.UserMapper;
import com.excise.crm.setting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: TODO
 * @author: FLY
 * @date: 2020/11/18 10:04
 * @version: v1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUsers() {
        return userMapper.selectAll();
    }
}
