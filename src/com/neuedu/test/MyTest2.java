package com.neuedu.test;

/**
 * Created by 86188 on 2020/2/5.
 * 冒泡排序
 */
public class MyTest2 {
    public static void main(String[] args) {
        int[] array={6,67,45,56,23,14,36,2,79,100};
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int tempt=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tempt;
                }
            }
        }
        for(int i:array){
            System.out.println(i);
        }
    }
}
