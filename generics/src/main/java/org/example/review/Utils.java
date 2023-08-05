package org.example.review;

import java.util.List;

public class Utils<T extends Person> {

    public T lastElement(List<T> list) {
        return list.get(list.size()-1);
    }

    public void printInfo(List<T> list){
        for(T s: list){
            System.out.println(s);
        }
        System.out.println(list.size());
    }


    public void printNames(List<T> personList){
        for(T person: personList){
            System.out.println(person.getName());
        }
    }
}
