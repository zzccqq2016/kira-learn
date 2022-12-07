package org.kira.lean.encrypt;

import com.ulisesbocchio.jasyptspringboot.configuration.EnvCopy;
import com.ulisesbocchio.jasyptspringboot.configuration.StringEncryptorBuilder;
import com.ulisesbocchio.jasyptspringboot.properties.JasyptEncryptorConfigurationProperties;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.BeanFactory;

/**
 * @author: Zhang Chaoqing
 * @date: 2022/12/7 16:56
 */
public class ConfEncryptReadMe {

    /**
     * 在不自定义{@link StringEncryptor}时，加密使用与框架自动注入的{@link StringEncryptor}保持一致
     * 参考{@link  com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration#stringEncryptor(EnvCopy, BeanFactory)}
     */
    public void encrypt() {
        JasyptEncryptorConfigurationProperties jasyptEncryptorConfigurationProperties = new JasyptEncryptorConfigurationProperties();
        //秘钥
        jasyptEncryptorConfigurationProperties.setPassword("hiekn");
        StringEncryptor build = new StringEncryptorBuilder(jasyptEncryptorConfigurationProperties, "jasypt.encryptor").build();
        System.out.println(build.encrypt("common"));
    }

}