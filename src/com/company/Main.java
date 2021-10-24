package com.company;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
        System.out.println("Input county 1, county 2 and county 3");
        String c1 = in.nextLine();
        String c2 = in.nextLine();
        String c3 = in.nextLine();
        System.out.println("Input duration of talks");
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();

        System.out.printf("Call from %s lasts %d minutes; \n" +
                "Call from %s lasts %d minutes; \n" +
                "Call from %s lasts %d minutes; \n", c1, t1, c2, t2, c3, t3);
        System.out.printf("All talk together last : %d minutes", t1+t2+t3);
    }
}