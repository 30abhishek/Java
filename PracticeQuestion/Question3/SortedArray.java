package com.company.PracticeQuestion.Question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArray<arr> {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(5);
        list1.add(1);
        list1.add(4);
        list1.add(3);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println("sorted array 1 =" + list1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(8);
        list2.add(6);
        list2.add(9);
        list2.add(7);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println("sorted array 2 ="+list2);
        list1.addAll(list2);
        System.out.println(list1);
        

    }



}
