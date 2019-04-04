package com.jsako.provider.service;

import org.springframework.stereotype.Service;

/**
 * @Date 2019/4/3
 * @Author LLJ
 * @Description
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrderName() {

        System.out.println("123");

        return "Linliangjin Service";
    }
}
