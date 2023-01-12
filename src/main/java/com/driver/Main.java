package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        System.out.println(p.product(1, 5));
        System.out.println(p.product(1,2,4));
        System.out.println(p.product(20.0,1.2));
    }
}
class Product{
    public int product(int x,int y){
        return x*x;
    }
    public int product(int x,int y,int z){
        return x*y*z;
    }
    public double product(double x,double y){
        return x*y;
    }
}