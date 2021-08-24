package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E extends Person>  implements Iterable<E> {

    List<E> personList = new ArrayList<E>();

    public People(List<E> personList) {
        this.personList = personList;
    }

    public People() {

    }

    public void add(E person){
        personList.add(person);

    }
    public E findById(long id){
        for (E person : personList)
            if(person.getId() == id)
                return person;

            return null;
    }
    public List findAll(){
        return personList;

    }
    public boolean contains(E person){
        if (personList.contains(person))
            return true;
        else
            return false;
    }
    public void remove(E person){
        if(contains(person))
            personList.remove(person);

    }
    public void removeById(long id){
        E person = findById(id);
        remove(person);
    }
    public void clear(){
        personList.clear();
    }
    public Integer size(){
        return personList.size();
    }
//    public int addAll(Iterable<Person> iterable){
//        Iterator iterator = iterable.iterator();
//        while(iterator.hasNext()){
//            personList.add((E) iterator.next());
//        }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] personArr = personList.toArray(new Person[0]);

        return personArr;
    }


    public Iterator<E> iterator() {
        return personList.iterator();
    }
}

