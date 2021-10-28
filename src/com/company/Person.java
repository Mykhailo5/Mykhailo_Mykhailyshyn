package com.company;

import java.util.Scanner;

public class Person{
    private  String name;
    private int birthYear;

    Person(){}

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void age(){
        int birthYear = 2002;
        int currentYear = 2021;
        int totalAge = currentYear - birthYear;
        System.out.println("Age of a person is: " + totalAge);
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input info about the person:");
        String info = in.nextLine();
        System.out.println("Info about the person is: " + info);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
