package com.company;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Person p1 = new Person("Ivan", 2002);
    System.out.println(p1);
    p1.age();
    p1.input();
    p1.setName("Igor");
    System.out.println(p1);
    System.out.println("-----------------------------------");
        Person p2 = new Person("Vasyl", 2002);
        System.out.println(p2);
        p1.age();
        p1.input();
        p1.setName("Vasya");
        System.out.println(p2);
    }
    }
