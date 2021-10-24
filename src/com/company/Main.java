package com.company;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double radius = 8.5;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is = " + perimeter);
        double area = Math.PI * radius * radius;
        System.out.println("Area is = " + area);
    }
    }
