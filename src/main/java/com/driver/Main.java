package com.driver;

public class Main {
    public static class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public Double product(Double x,Double y){
            return x*y;
        }
    }
    public static void main(String[] args) {
        Product p=new Product();

        p.product(1, 5);
        p.product(1,2,4);
        p.product(20.0,1.2);
    }
}
