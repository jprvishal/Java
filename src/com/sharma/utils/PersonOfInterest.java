package com.sharma.utils;

import java.util.ArrayList;
import java.util.List;
import com.sharma.entity.Person;

public class PersonOfInterest {

    private List<Person> persons;

    public PersonOfInterest() {
        persons = new ArrayList<Person>();
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void printPersonOfInterest(List<Person> persons, PerformCheckAgeAndSex test) {

        for(Person p: persons) {
            if (test.test(p)) {
                System.out.println("Person Name :- "  + p.getName() + " and Age is " + p.getAge());
            }
        }
    }

    public static void main(String[] args) {

        PersonOfInterest personOfInterest = new PersonOfInterest();
        Person p1 = new Person();
        p1.setAge(30);
        p1.setName("Person One");
        p1.setGender(Person.Sex.FEMALE);

        Person p2 = new Person();
        p2.setAge(12);
        p2.setName("Person Two");
        p2.setGender(Person.Sex.MALE);

        Person p3 = new Person();
        p3.setAge(39);
        p3.setName("Person Three");
        p3.setGender(Person.Sex.MALE);

        Person p4 = new Person();
        p4.setAge(9);
        p4.setName("Person Four");
        p4.setGender(Person.Sex.FEMALE);

        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        personOfInterest.printPersonOfInterest(list, new PerformCheckAgeAndSex());

//        personOfInterest.printPersonOfInterest(list, new PerformCheckAgeAndSex() {
//                public boolean test(Person p) {
//                    boolean returnVal = false;
//
//                    if (p.getGender() == Person.Sex.FEMALE && (p.getAge() > 15 && p.getAge() < 55)) {
//                        returnVal = true;
//                    }
//
//                    return returnVal;
//                }
//            }
//        );
    }
}
