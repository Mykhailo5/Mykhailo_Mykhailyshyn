package com.company;

public class Task {
    private int n;

    public Task(int n) {
        this.n = n;
    }

    public void checkIf3() {
        int p = (int) (Math.pow(n, 2));
        String strp = Integer.toString(p);
        char[] rez = strp.toCharArray();
        char num = '3';
        for (int i = 0; i < rez.length; i++) {
            if(num==rez[i]){
                System.out.println("Number 3 is present");
                break;
            } else{
                System.out.println("Number 3 is not present");
                break;
            }
        }
    }
    public void reversedLine() {
        String N = Integer.toString(n);
        char[] ArrayN = N.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(ArrayN));
        System.out.println("Reversed line is : " + stringBuilder.reverse());
    }

    public void changeFirsAndLastItem() {
        String text = String.valueOf(n);
        text = text.substring(text.length() - 1) + text.substring(1, text.length() - 1) + text.substring(0, 1);
        n = Integer.parseInt(text);
        System.out.println("Changed firs and last item : " + n);
    }
    public void add1() {
        System.out.print("Number with one number on the start and end:" + "1" + n + "1");
    }
}
