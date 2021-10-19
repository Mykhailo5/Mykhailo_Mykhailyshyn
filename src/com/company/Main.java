package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 0,b = 0,c = 0,x = 0,y = 0;
        Brick brick = new Brick();
        brick.setA(4.3);
        brick.setB(5.6);
        brick.setC(4.2);
        rectangleHole hole = new rectangleHole();
        hole.setX(8.8);
        hole.setY(9.6);
        if((brick.getA() <= hole.getX() && brick.getB() <= hole.getY()) ||
                (brick.getA() <= hole.getY() && brick.getB() <= hole.getX())){
            System.out.println("Can push further");
        }
        else if((brick.getA() <= hole.getX() && brick.getC() <= hole.getY()) ||
                (brick.getA() <= hole.getY() && brick.getC() <= hole.getX())){
            System.out.println("Can push further");
        }
        else if((brick.getC() <= hole.getX() && brick.getB() <= hole.getY()) ||
                (brick.getC() <= hole.getY() && brick.getB() <= hole.getX())){
            System.out.println("Can push further");
        }
        else{
            System.out.println("Cannot push further");
        }
    }
    }
