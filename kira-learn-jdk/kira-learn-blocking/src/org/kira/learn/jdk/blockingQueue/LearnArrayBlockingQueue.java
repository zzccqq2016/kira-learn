package org.kira.learn.jdk.blockingQueue;

import org.kira.learn.table.SampleTable;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/13 22:44
 */
public class LearnArrayBlockingQueue {


    /**
     *
     */
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(8);
        for (int i : SampleTable.DISORDER_NUMBER_TABLE) {
            System.out.println(arrayBlockingQueue.offer(i));
        }

    }


}