package org.kira.learn.jdk.io.nio.selector;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/25 23:35
 */
public class Client {


    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream out = socket.getOutputStream();
        String s = "hello world";
        out.write(s.getBytes());
        out.flush();
        out.close();
        TimeUnit.SECONDS.sleep(100);
    }

}