package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @org.junit.jupiter.api.Test
    void perimeter() {
        Main c = new Main();
        double radius = 8.5;
        double expected = 53.40707511102649;
        double actual = c.perimeter(radius);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void area() {
        Main c = new Main();
        double radius = 5.5;
        double expected = 95.03317777109123;
        double actual = c.area(radius);
        assertEquals(expected, actual);
    }
}