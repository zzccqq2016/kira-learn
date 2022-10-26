package org.kira.learn.jdk.io.nio.selector.learn2;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/26 23:55
 */
public class Handler implements Runnable {

    private final Selector selector;

    public Handler(SocketChannel socketChannel) {
        try {
            this.selector = Selector.open();
            socketChannel.configureBlocking(false);
            socketChannel.register(selector, SelectionKey.OP_READ);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void run() {
    }
}