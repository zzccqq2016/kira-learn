package org.kira.learn.conf.encrypt.controller;

import com.ulisesbocchio.jasyptspringboot.configuration.StringEncryptorBuilder;
import com.ulisesbocchio.jasyptspringboot.properties.JasyptEncryptorConfigurationProperties;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Zhang Chaoqing
 * @date: 2022/12/5 15:33
 */
@RestController
public class EncryotController {


    @Value("${kira.common:测试配置信息加密}")
    private String common;

    @GetMapping("test")
    public String test() {
        return common;
    }


    public static void main(String[] args) {
        JasyptEncryptorConfigurationProperties jasyptEncryptorConfigurationProperties = new JasyptEncryptorConfigurationProperties();
        jasyptEncryptorConfigurationProperties.setPassword("hiekn");
        StringEncryptor build = new StringEncryptorBuilder(jasyptEncryptorConfigurationProperties, "jasypt.encryptor").build();
        System.out.println(build.encrypt("common"));
    }


}