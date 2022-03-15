package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int a = 5;
        int b = 5;
        b++;
        boolean h = true;
        System.out.println(b);
        System.out.println("h = "+ h);
        System.out.println("h = "+ !h);
        String test = "This is a sample string";
        System.out.println("length of the string = "+test.length());
        System.out.println("index = "+test.indexOf('i'));

        int day = 1;
                if (day==1)
                    System.out.println("Monday");
                else if (day == 2)
                    System.out.println("Tuesday");
                else
                    System.out.println("another day");

int i = 5;
int fact = 1;
int j = 1;
while(j <=i){
    fact = fact * j;
    j++;
    System.out.println(fact);

    int numb = 1;
    do {
        System.out.println("numb-" +numb);
        numb++;
    } while (numb<=10);

}
int star = 5;
        for(int k = 0; k<= star; k++){
            for(int l = 0;l<=k;l++) {
                System.out.println("*");
            }
        }
        System.out.println();






        // write your code here
    }
}
