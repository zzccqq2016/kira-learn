package org.kira.learn.datastruct.recursion;

import java.util.Arrays;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/11/10 22:19
 */
public class BaHuanghou {

    private static final int MAX = 8;
    private static final int[] ARRAY = new int[MAX];

    private static int COUNT = 0;

    public static void main(String[] args) {
        BaHuanghou baHuanghou = new BaHuanghou();
        baHuanghou.check(0);
        System.out.println(COUNT);
    }

    private void print() {
        COUNT++;
        System.out.println(Arrays.toString(ARRAY));
    }

    public boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (ARRAY[i] == ARRAY[n] || Math.abs(n - i) == Math.abs(ARRAY[i] - ARRAY[n])) {
                return false;
            }
        }
        return true;
    }


    public void check(int n) {
        if (n == MAX) {
            print();
            return;
        }
        for (int i = 0; i < MAX; i++) {
            ARRAY[n] = i;
            if (judge(n)) {
                check(n + 1);
            }
        }
    }

}