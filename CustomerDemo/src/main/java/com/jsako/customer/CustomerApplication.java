package com.jsako.customer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Date 2019/4/3
 * @Author LLJ
 * @Description
 */
@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class CustomerApplication extends SpringBootServletInitializer {

    public static void main(String[] args){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(10));
       threadPoolExecutor.execute(()->{});
        System.out.println("123");
    }
}
