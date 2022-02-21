package com.company.assessment;

import java.util.Arrays;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        System.out.println(MaxEle(Arrays.asList(10,30,20,40)));

    }
    static int MaxEle(List<Integer> list){
        int max=list.get(0);
        for(int i=1;i<list.size();i++){
            if(max < list.get(i)){
                max= list.get(i);
            }
        }
        return max;
    }
}
