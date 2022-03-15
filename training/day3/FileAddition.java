package com.company.day3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAddition {
    public static void main(String[] args) throws IOException {
        Scanner textfile = new Scanner(new File("C:\\Users\\abhishek.shinde_info\\IdeaProjects\\java\\resources\\numbers.txt"));
        filereader(textfile);
    }
    static void filereader(Scanner textfile){
        int sum = 0;
        while (textfile.hasNextInt()){
            int nextInt = textfile.nextInt();
            System.out.println(nextInt);
            sum = sum + nextInt;

        }
        System.out.println("Sum = "+sum);
    }
}
