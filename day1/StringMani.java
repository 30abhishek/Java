package com.company;

public class StringMani {
    public static void main(String[] args) {
        String temp = "This is a sample sentence";
        printChar(temp);
        System.out.println(isPalindrome("karrak"));

    }
    public static void  printChar(String temp) {
        for (int i = 0; i < temp.length(); i++) {
            System.out.println(temp.charAt(i));
        }

    }

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }



}
