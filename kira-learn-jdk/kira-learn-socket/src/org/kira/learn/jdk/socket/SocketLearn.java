package org.kira.learn.jdk.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/19 10:37
 */
public class SocketLearn {


    public void socket() throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        while (true) {
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(bufferedReader.readLine());
        }
    }


}