package com.neuedu.test;

/**
 * Created by 86188 on 2020/2/10.
 */
public abstract class Shape {
    private double area;//面积属性
    private double per; //周长属性
    private String color;//颜色属性
    public Shape(){}//默认的构造方法
    //为颜色赋值的构造方法
    public Shape(String color){
        this.color=color;
    }
    //添加getColor()方法来获取颜色（便于子类直接用）
    public String getColor(){
        return color;
    }
    //三个抽象方法
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();
}
