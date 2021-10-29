package com.company;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Bird[] b = new Bird[3];
        b[0]=new Eagle();
        b[1]=new Swallow();
        b[2]=new Penguin();

        b[0].fly();
        System.out.println(b[0].feathers);
        System.out.println(b[0].layEggs);
        System.out.println("-----------------");
        b[1].fly();
        System.out.println(b[1].feathers);
        System.out.println(b[1].layEggs);
        System.out.println("-----------------");
        b[2].fly();
        System.out.println(b[2].feathers);
        System.out.println(b[2].layEggs);
    }
}