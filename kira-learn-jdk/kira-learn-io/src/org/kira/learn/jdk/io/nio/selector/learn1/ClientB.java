package org.kira.learn.jdk.io.nio.selector.learn1;

import java.io.IOException;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/26 17:48
 */
public class ClientB {
    public static void main(String[] args) throws IOException {
        new NioClient().start("ClientB");
    }
}