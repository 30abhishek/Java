package com.company.day3;

import java.util.ArrayList;
import java.util.List;

public class listOfInt {
    public static void main(String[] args) throws exception  {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        try {
            System.out.println(printlist(list,4));
        }catch (exception ex){
            System.out.println(ex.getMsg());
        }

    }
    public static Integer printlist(List <Integer> a,int index) throws exception{
        if(a.size() < index || index <0)
            throw new exception("index value should be lie in size of list");
        else
            return a.get(index);
        //System.out.println(a);
//        for(l:a){
//
//        }
    }



    private static void printlist(List<Integer> list) {
        System.out.println(list);
    }
}
