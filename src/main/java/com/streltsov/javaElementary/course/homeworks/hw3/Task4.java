package com.streltsov.javaElementary.course.homeworks.hw3;

public class Task4 {

    static StringBuilder buildOfSinus = new StringBuilder("");

    public static void main(String[] args) {


        createSinusEquation(3);

        System.out.println("((sin(1)+3)sin(1–sin(2))+2)sin(1–sin(2+sin(3)))+1");


    }


    private static StringBuilder createPartOfSinusEquation(int numb) {


        int count = 1;
        StringBuilder brackets = new StringBuilder();

        do {
            buildOfSinus.append("sin(").append(count);

            if (count % 2 == 0 & count != numb) {
                buildOfSinus.append("+");
            } else if (count % 2 != 0 & count != numb) {
                buildOfSinus.append("-");
            }

            count++;
            brackets.append(")");

        } while (count != numb + 1);

        return buildOfSinus.append(brackets);
    }

    private static void createSinusEquation(int number) {

        if (number==1) {
            createPartOfSinusEquation(number).append(" +").append(number);
            System.out.println(buildOfSinus.toString());
            return;
        }

        int i, n;

        for(int k = 1; k < number; k++){
            buildOfSinus.append("(");
        }

        for (i = 1, n = number  ; i < number; i++, n--) {

            createPartOfSinusEquation(i).append("+").append(n);
            buildOfSinus.append(")");
        }

        createPartOfSinusEquation(number).append("+1");

        System.out.println(buildOfSinus.toString());
    }

}
