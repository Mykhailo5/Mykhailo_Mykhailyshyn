package com.company;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.name = "Bobik";
        d1.Breed = breed.Beagle;
        d1.age = 3;
        System.out.println(d1);

        Dog d2 = new Dog();
        d2.name = "Sharik";
        d2.Breed = breed.Boxer;
        d2.age = 8;
        System.out.println(d2);

        Dog d3 = new Dog();
        d3.name = "Rex";
        d3.Breed = breed.Poodle;
        d3.age = 6;
        System.out.println(d3);

        System.out.println("-----------------------------");

        if (d1.name.equals(d2.name) || d1.name.equals(d3.name) || d2.name.equals(d3.name)) {
            System.out.println("ATTENTION!!! There are dogs with the same name!");
        }

        if (d1.age > d2.age && d1.age > d3.age) {
            System.out.println("First dog is the oldest");
        } else if (d2.age > d1.age && d2.age > d3.age)

            System.out.println("Second Person is the Oldest.");

        else if (d3.age > d1.age && d3.age > d2.age)

            System.out.println("Third Person is the Oldest.");

        else {

            System.out.println("All have equal ages.");
        }
    }
}
enum breed
{
    Boxer,
    Rottweiler,
    Poodle,
    Beagle
}