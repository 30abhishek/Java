package com.company;
import java.lang.Math;

public class Problems {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 4;
        int y1 =4;
        int y2 = 8;
        System.out.println(distance(x1,y1,x2,y2));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }



}


