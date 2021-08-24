package com.example.demo.Entity;

import com.example.demo.Entity.Person;
import com.example.demo.Learner;

public class Student extends Person implements Learner {
    Double totalStudyTime;
    public Student(Long id, String name) {
        super(id, name);
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;

    }
}
