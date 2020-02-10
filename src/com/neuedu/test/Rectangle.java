package com.neuedu.test;

/**
 * Created by MacheNike on 2020/2/5.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(){}
    public Rectangle(double height,double width,String color){
        super(color);
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea(){
        return height*width;
    }
    public double getPer(){
        return (height+width)*2;
    }
    public void showAll(){
        System.out.println("矩形面积="+getArea());
        System.out.println("矩形周长="+getPer());
        System.out.println("矩形颜色="+getColor());
    }

}
