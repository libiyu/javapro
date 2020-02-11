package com.neuedu.test;

/**
 * Created by 86188 on 2020/2/10.
 */
public class Circle extends Shape{
    private double radius;
    public Circle(){}//添加默认构造方法
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
    @Override
    public double getPer() {
        return 2*3.14*radius;
    }
    @Override
    public void showAll() {
        System.out.println("圆的面积="+getArea());
        System.out.println("圆的周长="+getPer());
        System.out.println("圆的颜色="+getColor());
    }
    public Circle(double radius,String color){
        super(color);
        this.radius=radius;//给圆的半径赋值
    }
}
