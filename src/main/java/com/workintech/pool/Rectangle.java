package com.workintech.pool;

public class Rectangle {
    private double width,length;

    public Rectangle(double width, double length) {
        this.width = Math.max(width, 0); //Math.max ile width 0dan küçükse 0 gelir. 0'dan Büyükse width gelir.
        this.length = Math.max(length, 0);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public  double getArea(){
        return  this.width*this.length;
    }
}
