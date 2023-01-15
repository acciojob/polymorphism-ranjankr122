package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
     int x,y,z;
     double x1,x2;
     TestCases(int x,int y){
         this.x=x;
         this.y=y;
     }
     TestCases(int x,int y,int z){
         this.x=x;
         this.y=y;
         this.z=z;

     }
     TestCases(Double x,Double y){
         x1=x;
         x2=y;
     }
}
