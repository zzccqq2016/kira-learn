package org.kira.learn.tomcat.demo.jmx;

import javax.management.Notification;
import javax.management.NotificationListener;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/13 10:31
 */
public class HelloListener implements NotificationListener {

    public void handleNotification(Notification notification, Object handback) {
        if (handback instanceof Hello) {
            Hello hello = (Hello) handback;
            hello.helloWorld(notification.getMessage());
        }
    }

}