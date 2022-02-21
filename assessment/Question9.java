package com.company.assessment;

import java.util.ArrayList;
import java.util.List;

public class Question9 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(-1);
        l.add(5);
        l.add(8);
        l.add(-10);
        l.add(4);
        System.out.println(Negatives(l));
    }

    static List<Integer> Negatives(List<Integer> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i)<0){
                list.remove(i);
            }
        }
        return list;
    }
}
