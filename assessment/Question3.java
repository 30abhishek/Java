package com.company.assessment;

public class Question3 {
    public static void main(String[] args) {
        System.out.println(fib_ite(10));
        System.out.println("____________________________");
        System.out.println(fib_rec(7));

    }
    static int fib_ite(int num){
        int  n2 = 0, n3 = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(n2);
            int nextNum = n2 + n3;
            n2 = n3;
            n3 = nextNum;

        }
        return n3;
    }

    static int fib_rec(int num){
        if(num<= 1){
            return num;
        }
        return fib_rec(num-1) + fib_rec(num-2);

    }

}

