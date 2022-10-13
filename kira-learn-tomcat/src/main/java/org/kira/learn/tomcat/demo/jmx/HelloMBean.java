package org.kira.learn.tomcat.demo.jmx;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/13 10:27
 */
public interface HelloMBean {
    String getName();

    void setName(String name);

    String getAge();

    void setAge(String age);

    void helloWorld();

    void helloWorld(String str);

    void getTelephone();
}