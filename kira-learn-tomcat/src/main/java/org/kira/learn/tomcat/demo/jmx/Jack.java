package org.kira.learn.tomcat.demo.jmx;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/13 10:31
 */
public class Jack extends NotificationBroadcasterSupport implements JackMBean {
    private int seq = 0;

    public void hi() {
        //创建一个信息包
        Notification notify =
                //通知名称；谁发起的通知；序列号；发起通知时间；发送的消息
                new Notification("jack.hi", this, ++seq, System.currentTimeMillis(), "jack");
        sendNotification(notify);
    }

}