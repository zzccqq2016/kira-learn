package org.kira.lean.web;

import org.kira.lean.web.convert.CommonConvert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @author: Zhang Chaoqing
 * @date: 2022/12/7 16:52
 */
@SpringBootApplication
public class KiraWebApplication {

    @Resource
    private CommonConvert convert;

    public static void main(String[] args) {
        SpringApplication.run(KiraWebApplication.class, args);
    }


}