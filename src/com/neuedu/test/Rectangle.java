package com.neuedu.test;

/**
 * Created by 86188 on 2020/2/10.
 */
public class Rectangle extends Shape{
    private double width;
    private double height;
    //默认的构造方法
    public Rectangle(){}
    //用构造方法给私有属性赋值
    public Rectangle(double width,double height,String color){
        super(color);//调用父类的参数，把color赋值给他
        this.width=width;
        this.height=height;
    }
    @Override
    public double getArea() {
        return width*height;
    }
    @Override
    public double getPer() {
        return 2*(width+height);
    }
    @Override
    public void showAll() {
        System.out.println("矩形面积="+getArea());
        System.out.println("矩形周长="+getPer());
        System.out.println("矩形颜色="+getColor());
    }
}
