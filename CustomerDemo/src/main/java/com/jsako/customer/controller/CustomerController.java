package com.jsako.customer.controller;

import com.jsako.provider.service.OrderService;
import com.jsako.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Date 2019/4/3
 * @Author LLJ
 * @Description
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @RequestMapping("/invoke")
    @ResponseBody
    public String invoke() {
        String orderName = orderService.getOrderName();
        return orderName;
    }


    @RequestMapping("/user")
    @ResponseBody
    public String user() {
        return userService.getUserName();
    }

}
