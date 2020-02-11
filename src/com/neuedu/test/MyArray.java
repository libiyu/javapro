package com.neuedu.test;

/**
 * Created by 86188 on 2020/2/10.
 * 与Mytest3测试类相对应
 * 动态数组
 */
public class MyArray {
    //array作为存储数据的数组
    private int[] array;
    //size作为实际放入数据的个数（空数组不看）
    private int size;
    public MyArray(){   //调构造方法
        size=0;//一开始调构造方法的时候，size=0，即没放东西。
        array=new int[10];
    }
    public int getSize(){
        return size;
    }
    public void add(int i){
        //如果实际放入数组的个数≥数组的长度，说明越界，则需要扩大容量。
        if(size>=array.length){
            //扩大容量的方式：定义一个长度更大的数组，把之前的数组复制进去，默认扩大原数组的1.5倍
            int[] newarray=new int[size+size/2];//或者可以写成new int[size*1.5]
            for(int j=0;j<=array.length;j++){   //循环遍历新数组的下标
                newarray[j]=array[j];  //将旧数组复制过来
            }
                 array=newarray;//由于始终操作的是array，所以到最后，array就是那个新数组
                 System.out.println("扩容完成，新数组长度为"+array.length);
        }
        array[size++]=i;//先取值再自加，相当于array[size]=i;size++;
    }
    //通过下标取值
    public int get(int i){
        //取值范围是0-----size-1
        if(i<0||i>=size){
            System.out.println("索引错误");
            return -1;
        }
        return array[i];
    }
}
