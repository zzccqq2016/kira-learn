package org.kira.learn.conf.encrypt;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.ulisesbocchio.jasyptspringboot.configuration.EnvCopy;
import com.ulisesbocchio.jasyptspringboot.configuration.StringEncryptorBuilder;
import com.ulisesbocchio.jasyptspringboot.properties.JasyptEncryptorConfigurationProperties;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Zhang Chaoqing
 * @date: 2022/12/5 15:31
 */
@EnableEncryptableProperties
@SpringBootApplication
public class ConfEncryptApplication {


    /**
     * <a href="https://blog.csdn.net/donkeyboy001/article/details/124400281">...</a>
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfEncryptApplication.class, args);
    }


    /**
     * 在不自定义{@link StringEncryptor}时，加密使用与框架自动注入的{@link StringEncryptor}保持一致
     * 参考{@link  com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration#stringEncryptor(EnvCopy, BeanFactory)}
     */
    public void encrypt() {
        JasyptEncryptorConfigurationProperties jasyptEncryptorConfigurationProperties = new JasyptEncryptorConfigurationProperties();
        jasyptEncryptorConfigurationProperties.setPassword("hiekn");
        StringEncryptor build = new StringEncryptorBuilder(jasyptEncryptorConfigurationProperties, "jasypt.encryptor").build();
        System.out.println(build.encrypt("common"));
    }

}