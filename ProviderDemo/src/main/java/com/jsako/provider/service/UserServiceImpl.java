package com.jsako.provider.service;

import org.springframework.stereotype.Service;

/**
 * @Date 2019/4/3
 * @Author LLJ
 * @Description
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "jsako";
    }
}
