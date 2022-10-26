package org.kira.learn.jdk.io.nio.selector.learn2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/26 23:39
 */
public class Reactor implements Runnable {

    private final Selector selector;


    public Reactor(String host, Integer ip) {
        try {
            this.selector = Selector.open();
            ServerSocketChannel ssChannel = ServerSocketChannel.open();
            ssChannel.bind(new InetSocketAddress(host, ip));
            ssChannel.configureBlocking(false);
            SelectionKey selectionKey = ssChannel.register(this.selector, SelectionKey.OP_ACCEPT);
            selectionKey.attach(new Acceptor(ssChannel));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                this.selector.select();
                Set<SelectionKey> selectionKeys = this.selector.selectedKeys();
                Iterator<SelectionKey> keyIterator = selectionKeys.iterator();
                while (keyIterator.hasNext()) {
                    dispatch(keyIterator.next());
                    keyIterator.remove();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }


    public void dispatch(SelectionKey selectionKey) {
        Runnable attachment = (Runnable) selectionKey.attachment();
        attachment.run();
    }
}