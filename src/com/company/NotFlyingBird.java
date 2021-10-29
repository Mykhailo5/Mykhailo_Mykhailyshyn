package com.company;

public class NotFlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("This bird cannot fly");
    }
}
