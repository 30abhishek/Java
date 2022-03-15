package com.company.day12;

import java.util.ArrayList;
import java.util.List;

public class Users{
    private List<Integer> userID;
//    private BubbleSort bubbleSort;
    private Sorting sorting;

    public Users(){
        userID = new ArrayList<>();
//        bubbleSort = new BubbleSort();

    }
    public void addSortingMethod(Sorting _sorting){
        sorting = _sorting;
    }
    public void addUser(Integer Id){
        userID.add(Id);
    }
    public void sort(){
        sorting.sort(userID);
    }
}
