package org.kira.learn.jdk.blockingQueue;

import org.kira.learn.table.SampleTable;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/13 22:58
 */
public class LearnSynchronousQueue {

    /**
     * 使用SynchronousQueue的目的就是保证“对于提交的任务，如果有空闲线程，则使用空闲线程来处理；否则新建一个线程来处理任务”。
     * <a href="https://www.jianshu.com/p/b7f7eb2bc778">...</a>
     */
    public static void main(String[] args) {
        BlockingQueue<Integer> synchronousQueue = new SynchronousQueue<>(false);
    }
}