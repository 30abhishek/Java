package com.company.day4;


import java.util.*;

public class DataStructures {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("name1");
        list.add("name2");
        list.add("name3");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for(String str: list){
            System.out.println(str);
        }
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("link1");
        list2.add("link2");
        list2.add("link3");
        System.out.println(list2.get(2));

        for(String element: list2){
            System.out.println(element);

        }
        List<String> names = Arrays.asList("red","green","black");
        System.out.println(names);

        List<String> temp = new ArrayList<>();
        temp.add("This");
        temp.add("is");
        temp.add("a");
        temp.add("sentence");
        System.out.println((temp));
        System.out.println(Collections.frequency(temp,"is"));

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("removed element = "+ queue.remove());
        System.out.println("quque- " + queue);
        queue.add(4);
        System.out.println("quque- " + queue);

        ////////////////Priority Queue/////////////////
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.add(10);
        priorityQueue.add(25);
        priorityQueue.add(15);
        priorityQueue.add(30);
        while (priorityQueue.size()>0) //removing element based on priority
            System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue);

        ///////////////////////// max element in a list
        

    }


    }


