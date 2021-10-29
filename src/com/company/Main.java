package com.company;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(div(4.5, 6.6));
        System.out.println(readNumber(5,10));
    }

    public static double div(double a, double b) throws Exception {
        if(a==0 || b==0) throw new Exception("Can't divide by 0");
            return a/b;
    }


    public static int readNumber(int start, int end) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = in.nextInt();
        if(num<start || num>end){
            throw new Exception("Entered number is out of bounds");
        }
        else {
            return num;
        }
    }
    }
