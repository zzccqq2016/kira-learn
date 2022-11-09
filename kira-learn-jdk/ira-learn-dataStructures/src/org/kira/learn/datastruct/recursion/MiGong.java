package org.kira.learn.datastruct.recursion;

import java.util.Arrays;

/**
 * 递归回溯
 * @author: Zhang Chaoqing
 * Date: 2022/11/9 23:03
 */
public class MiGong {

    //迷宫
    private static final int[][] MAP = new int[8][7];

    public static void main(String[] args) {


        //初始化迷宫.设置墙
        MiGong miGong = new MiGong();
        miGong.setWall(MAP);
        miGong.printArray(MAP);

        System.out.println("---------------------");
        //使用递归回溯来给小球赵路
        miGong.setWay(MAP, 1, 1);
        miGong.printArray(MAP);

    }

    public void setWall(int[][] map) {
        Arrays.fill(map[0], 1);
        Arrays.fill(map[map.length - 1], 1);
        for (int i = 0; i < map.length - 1; i++) {
            map[i][0] = 1;
            map[i][map[i].length - 1] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
    }

    public void printArray(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.print("\n");
        }

    }


    public boolean setWay(int[][] map, int i, int j) {
        printArray(map);
        System.out.println("------------------------------");
        if (map[6][5] == 2) {
            return true;
        } else {
            //如果当前这个点还没走过
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (down(map, i, j)) {
                    return true;
                } else if (left(map, i, j)) {
                    return true;
                } else if (right(map, i, j)) {
                    return true;
                } else if (up(map, i, j)) {
                    return true;
                } else {
                    //说明死点走不同
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }


    public boolean right(int[][] map, int i, int j) {
        return setWay(map, i, j + 1);
    }

    public boolean left(int[][] map, int i, int j) {
        return setWay(map, i, j - 1);
    }

    public boolean up(int[][] map, int i, int j) {
        return setWay(map, i - 1, j);
    }

    public boolean down(int[][] map, int i, int j) {
        return setWay(map, i + 1, j);
    }

}