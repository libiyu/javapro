package com.neuedu.test;

/**
 * Created by 86188 on 2020/2/10.
 *
 * 与MyArray类相对应的测试类
*/
public class Mytest3 {
    public static void main(String[] args) {
        MyArray myArray=new MyArray();
         for(int i=1;i<=11;i++){
             myArray.add(i);
        }
        for(int i=0;i<myArray.getSize();i++) {
            System.out.println(myArray.get(i));
        }
    }
}
/**   int[] array=new int[6];//定义数组
 array[0]=1;
 array[1]=2;
 array[2]=3;
 array[3]=4;
 array[4]=5;
 array[5]=6;
 int[] array2=new int[10];
 array2[0]=array[0];
 array2[6]=7;    表示再定义一个更大的数组再将原来的数组放入这个更大的数组里面*/