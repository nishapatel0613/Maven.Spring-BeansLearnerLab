package com.example.demo.Entity;

import com.example.demo.Learner;
import com.example.demo.Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
       learner.learn(numberOfHours);
    }

    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
       List<Learner> list = iterableToList(learners);
       for(Learner learner : list){
           teach(learner, (numberOfHours/list.size()));
       }
    }

    private List<Learner> iterableToList(Iterable<? extends Learner> learners) {
        Iterator iterator = learners.iterator();
        List<Learner> learnerList = new ArrayList<>();
        while(iterator.hasNext()){
            learnerList.add((Learner) iterator.next());
        }
        return learnerList;
    }
}
