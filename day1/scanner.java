package com.company;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = scanner.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("Area of circle = " + area);
    }




}
