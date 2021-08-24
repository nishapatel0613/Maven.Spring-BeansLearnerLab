package com.example.demo.Entity;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    public Instructors() {
        super();
        Instructor instructor = new Instructor(5L,"John");

        add(new Instructor(3L,"Meson"));
        add(new Instructor(2L,"Joe"));
    }
    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] toArray(){
        return personList.toArray(new Instructor[0]);
    }
}
