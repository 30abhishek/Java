package com.company.day3;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10, n2 = 0, n3 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(n2);
            int nextNum = n2 + n3;
            n2 = n3;
            n3 = nextNum;

        }
    }

    }
