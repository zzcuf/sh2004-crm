package com.excise.crm.setting.service;

import com.excise.crm.setting.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: TODO
 * @author: FLY
 * @date: 2020/11/18 10:02
 * @version: v1.0
 */

public interface UserService {

    List<User> queryUsers();
}
