package com.company;

public class recursive {
    public static void main(String[] args) {
        System.out.println(sumRecursive(2));
        System.out.println(sumIterative(2));

    }
    public static long sumRecursive(long num){
        if (num == 1){
            return 1;
        }
        return sumRecursive(num-1)+num;
    }
    public static long sumIterative(long num){
        long sum = 0;
        for (long i = 0; i<=num; i++){
            sum = sum + i;

        }
        return sum;
    }
}
