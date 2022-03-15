package com.company.day12;

public class Main {
    public static void main(String[] args) {
        Users user = new Users();
        user.addSortingMethod(new BubbleSort());
        user.sort();
    }
}