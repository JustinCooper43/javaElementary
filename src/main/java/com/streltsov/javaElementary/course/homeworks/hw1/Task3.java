package com.streltsov.javaElementary.course.homeworks.hw1;

public class Task3 {

    public static void main(String[] args) {

        for (int k = 0; k < 7; k++) {
            if (k == 0 || k == 6) {
                for (int i = 0; i < 3; i++) {

                    for (int j = 0; j < 7; j++) {

                        System.out.print("#");
                    }
                    System.out.print("    ");
                }
            } else {
                for (int i = 0; i < 3; i++) {

                    if (i == 0) {

                        for (int j = 0; j < 7; j++) {

                            if (j == 0 | j == 6) {
                                System.out.print("#");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    } else if (i == 1) {
                        for (int j = 0; j < 7; j++) {
                            if (j == k) {
                                System.out.print("#");
                            } else {
                                System.out.print(" ");
                            }
                        }

                    } else {
                        for (int j = 6; j > 0; j--) {
                            if (j == k) {
                                System.out.print("#");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.print("    ");
                }
            }
            System.out.println();

        }

    }
}
