package com.neuedu.test;

import java.util.Scanner;

/**
 * Created by 86188 on 2020/2/13.
 *
 * 狼人杀发牌器
 *
 */
public class MyTest7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//从控制台输入
        int player=scanner.nextInt();
        if(player>18||player<12)
            System.out.println("不符合游戏人数");
    }
}
