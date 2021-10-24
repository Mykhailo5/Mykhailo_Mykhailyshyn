package com.company;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        readFloats(4.15f, -4.66f, 4.59f);
        System.out.println(readMinIntegers(new int[]{ 15, 7, 6, 18}));
        System.out.println(readMaxIntegers(new int[]{3, 56, 34, 76, 8}));
        HTTPerrors(300);
    }

    public static void readFloats(float a, float b, float c){
    if((a<=-5 || a>=5) || (b<=-5 || b>=5) || (c<=-5 || c>=5)){
        System.out.println("Number is below -5 or higher than 5");
    }
    else {
        System.out.println("First number: " + a + " Second number: " + b + " Third number: " + c);
    }
    }

    public static int readMinIntegers(int[] arr){
    int rez = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(rez>arr[i]){
                rez = arr[i];
            }
        }
        return rez;
    }

    public static int readMaxIntegers(int[] arr){
        int rez = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(rez<arr[i]){
                rez = arr[i];
            }
        }
        return rez;
    }

    public static void HTTPerrors(int err){
    if(err==400){
        System.out.println("Поганий запит");
    }
    else if(err==401){
        System.out.println("Неавторизовано");
    }
    else if(err==402){
        System.out.println("Необхідна оплата");
    }
    else{
        System.out.println("Not an error");
    }
    }

}
