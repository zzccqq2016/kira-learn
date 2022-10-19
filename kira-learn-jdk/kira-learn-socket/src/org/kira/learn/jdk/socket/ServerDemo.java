package org.kira.learn.jdk.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/19 11:03
 */
public class ServerDemo {


    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(SocketServer.SERVER_PORK);
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String msg;
        while (true) {
            msg = bufferedReader.readLine();
            System.out.println("接受到客户端msg");
            if (msg != null) {
                System.out.println("客户端:" + msg);
            }
        }

    }


}