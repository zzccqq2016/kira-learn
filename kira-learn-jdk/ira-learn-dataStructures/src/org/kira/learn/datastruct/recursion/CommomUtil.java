package org.kira.learn.datastruct.recursion;

import java.util.Arrays;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/11/10 22:21
 */
public class CommomUtil {


    /**
     * 创建二维数组，初始化所有元素为0
     *
     * @param length 数组的长度
     * @param wide   维度
     * @return 二维数组
     */
    public static int[][] createAndInit(int length, int wide) {
        int[][] map = new int[wide][length];
        for (int[] ints : map) {
            Arrays.fill(ints, 0);
        }
        return map;
    }

    public static void printArray(int[][] map) {
        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.print("\n");
        }

    }

}