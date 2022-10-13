package org.kira.learn.tomcat.demo.jmx;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/13 10:28
 */
public class HelloAgent {

    public static void main(String[] args) throws JMException, Exception {
//        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
//        ObjectName helloName = new ObjectName("jmxBean:name=hello");
//        //create mbean and register mbean
//        server.registerMBean(new Hello(), helloName);
//        Thread.sleep(60 * 60 * 1000);

        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName helloName = new ObjectName("yunge:name=Hello");
        Hello hello = new Hello();
        server.registerMBean(hello, helloName);
        Jack jack = new Jack();
        server.registerMBean(jack, new ObjectName("jack:name=Jack"));
        jack.addNotificationListener(new HelloListener(), null, hello);

        jack.hi();

        Thread.sleep(500000);

    }
}