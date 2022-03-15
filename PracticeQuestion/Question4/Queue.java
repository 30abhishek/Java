package com.company.PracticeQuestion.Question4;

public class Queue {
    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.insertion(1);
        queue.insertion(3);
        queue.insertion(4);
        queue.insertion(2);
        System.out.println(queue);


        System.out.println(queue.deletion());
        System.out.println(queue);


    }
}
