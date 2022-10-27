package org.kira.learn.jdk.io.nio.selector.learn1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/26 17:46
 */
public class NioClient {

    /**
     * 启动
     */
    public void start(String nickname) throws IOException {
        /**
         * 连接服务器端
         */
        SocketChannel socketChannel = SocketChannel.open(
                new InetSocketAddress("127.0.0.1", 8000));

        /**
         * 接收服务器端响应
         */
        // 新开线程，专门负责来接收服务器端的响应数据
        // selector ， socketChannel ， 注册
        Selector selector = Selector.open();
        socketChannel.configureBlocking(false);
        socketChannel.register(selector, SelectionKey.OP_READ);
        new Thread(new NioClientHandler(selector)).start();

        /**
         * 向服务器端发送数据
         */
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String request = scanner.nextLine();
            if (request != null && request.length() > 0) {
                socketChannel.write(
                        StandardCharsets.UTF_8
                                .encode(nickname + " : " + request));
            }
        }

    }

//    public static void main(String[] args) throws IOException {
//        new NioClient().start("ClientA");
//    }
}