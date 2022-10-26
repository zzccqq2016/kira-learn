package org.kira.learn.jdk.io.nio.selector.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/25 23:35
 */
public class Client {


    public static void main(String[] args) throws IOException, InterruptedException {
        //选择器
        Selector selector = Selector.open();
        //开过SocketChannel
        SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8888));
        //SocketChannel配置非阻塞
        sChannel.configureBlocking(false);
        //SocketChannel注册到选择器
        sChannel.register(selector, SelectionKey.OP_READ);

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String request = scanner.nextLine();
            if (request != null && request.length() > 0) {
                sChannel.write(
                        StandardCharsets.UTF_8
                                .encode(request));
            }
        }
    }

}