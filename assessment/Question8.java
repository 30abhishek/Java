package com.company.assessment;

import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        System.out.println(Anagram("abc","cba"));
    }

    static boolean Anagram(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
