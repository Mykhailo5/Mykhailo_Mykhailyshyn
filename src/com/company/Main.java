package com.company;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<String, String>();
        personMap.put("Ivanov", "Oleg");
        personMap.put("Petrov", "Mykola");
        personMap.put("Mykhailyshyn", "Mykhailo");
        personMap.put("Vasylyshyn", "Yaroslav");
        personMap.put("Merza", "Maria");
        personMap.put("Levitskiy", "Oleg");
        personMap.put("Pelenskiy", "Arthur");
        personMap.put("Popovych", "Mykhailo");
        personMap.put("Seniuta", "Denys");
        personMap.put("Palyvoda", "Maryana");

        //to find by value
        System.out.println("personMap before removal: " + personMap);
        personMap.values().removeIf(value -> value == "Mykhailo");
        System.out.println("personMap after removal: " + personMap);

        //to find by key
      /*for(Iterator<String> iterator = personMap.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            if(key == "Mykhailo") {
                iterator.remove();
            }
        }
        System.out.println(personMap);*/
    }
    }
