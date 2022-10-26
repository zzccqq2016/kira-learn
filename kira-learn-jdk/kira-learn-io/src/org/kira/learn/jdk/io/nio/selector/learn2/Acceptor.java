package org.kira.learn.jdk.io.nio.selector.learn2;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/26 23:33
 */
public class Acceptor implements Runnable {

    private final ExecutorService executor = Executors.newFixedThreadPool(20);


    private final ServerSocketChannel ssChannel;

    public Acceptor(ServerSocketChannel serverSocketChannel) {
        this.ssChannel = serverSocketChannel;
    }

    @Override
    public void run() {
        try {
            SocketChannel sChannel = ssChannel.accept();
            if (sChannel != null) {
                executor.execute(null);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}