package com.jsako.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * @Date 2019/4/3
 * @Author LLJ
 * @Description
 */
@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class ProviderApplication extends SpringBootServletInitializer {
}
