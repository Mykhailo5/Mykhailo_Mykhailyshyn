package com.company;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println(perimeter(8.5));
        System.out.println(area(5.5));
    }

    public static double perimeter(double radius){
        return 2*Math.PI * radius;
    }

    public static double area(double radius){
        return Math.PI * radius * radius;
    }
    }
