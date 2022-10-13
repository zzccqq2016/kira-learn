package org.kira.learn.jdk.blockingQueue;

import org.kira.learn.table.SampleTable;

import java.sql.SQLOutput;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/13 23:10
 */
public class LearnPriorityBlockingQueue {


    /**
     * poll take remove 出来的时候会根据优先级 将优先级最小的最先取出
     */
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>(2);
        for (int i : SampleTable.DISORDER_NUMBER_TABLE) {
            System.out.println(priorityBlockingQueue.offer(i));
        }
        for (int i = 0; i < SampleTable.DISORDER_NUMBER_TABLE.length-1; i++) {
            System.out.println(priorityBlockingQueue.remove());
        }

    }

}