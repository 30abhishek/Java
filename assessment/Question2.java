package com.company.assessment;

import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static boolean SumOfTwo(List<Integer> num,int sum){
        for (int i = 0; i < num.size()-1; i++){
            for(int j = 1; j< num.size(); j++){
                if((num.get(i)) + (num.get(j)) == sum){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(SumOfTwo(Arrays.asList(1 , 2, 3, 4, 5, 6, 7),11));
        System.out.println(SumOfTwo(Arrays.asList(1 , 2, 3, 4, 5, 6, 7),117));

    }
}
