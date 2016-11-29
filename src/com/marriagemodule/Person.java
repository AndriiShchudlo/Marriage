package com.marriagemodule;


public class Person {
    String name;
    Sex sex;
    int age;
    boolean married;

    public Person(){}

    public Person(String name, Sex sex, int age, boolean married) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.married = married;
    }
}
