package com.company;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void test1() throws Exception {
        double a = 4.5;
        double b = 6.6;
        double expected = 0.6818181818181819;
        double actual = Main.div(a, b);
        assertEquals(expected,actual);
    }

}