package com.heitian.ssm.service;

import com.heitian.ssm.model.User;
import com.heitian.ssm.model.UserTest;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    UserTest getUserById(Long userId);
}