package com.streltsov.javaElementary.course.homeworks.hw1;

public class Task1 {
    public static void main(String[] args) {

        changeNumb(3, 5);
        changeNumbBuffer(0, 1);

    }

    public static void changeNumbBuffer(int a, int b) {

        System.out.println("Before a = " + a + "  " + "b = " + b);

        int bufferNumber;
        bufferNumber = a;
        a = b;
        b = bufferNumber;

        System.out.println("After a = " + a + "  " + "b = " + b);
    }

    public static void changeNumb(int a, int b) {

        System.out.println("Before a = " + a + "  " + "b = " + b);

        //Using the XOR operation
        // a = 3 b = 5
        // a = 011 in binary
        // b = 101 in binary


        a = b ^ a; // 6 = 3 ^ 5   110 = 011 ^ 101
        b = b ^ a; // 3 = 5 ^ 6   011 = 101 ^ 110
        a = b ^ a; // 5 = 3 ^ 6   101 = 011 ^ 110

        System.out.println("After a = " + a + "  " + "b = " + b);

    }
}
