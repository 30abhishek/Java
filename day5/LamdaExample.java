package com.company.day5;

public class LamdaExample {
    public static void main(String[] args) {

    }
    public static int function(int num1, int num2, Operation operation){
        return operation.operate(num1,num2);

    }
    interface Operation{
        public int operate(int num1, int num2);

    }
    class AddOperation implements Operation{
        public int operate(int num1, int num2) {
            return num1 + num2;
        }
    }
    class MinusOperation implements Operation{
        public int operate(int num1, int num2){
            return num1 - num2;
        }
    }


}
