package com.company.PracticeQuestion.Question4;

import java.util.ArrayList;
import java.util.List;

public class GenericQueue<E> {

    private List<E> list = new ArrayList<>();


    public void insertion(E element){
        list.add(element);
    }


    public E deletion(){
        if(list.isEmpty()){
            return null;
        }
        E firstElement = list.get(0);
        list.remove(list.get(0));
        return firstElement;

    }

    @Override
    public String toString() {
        return list.toString();
    }
}
