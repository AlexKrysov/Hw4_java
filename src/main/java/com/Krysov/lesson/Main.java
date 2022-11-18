package com.Krysov.lesson;

public class Main {
    public static void main(String[] args) {
        byte a = 100;
        short b = 100;
        int c = 100;
        long d = 100L;
        double e = 100.05;
        float f = 100.05f;

//        переполнение
        byte a1 = (byte) (a + 100);
        short b1 = (short) (b + 32767);
        int c2 = Integer.MAX_VALUE;
        int c1 = c2 + 100;

        System.out.println("переполнение byte = " + a1);
        System.out.println("переполнение short = " + b1);
        System.out.println("переполнение int = " + c1);

//        вычисления комбинаций типов данных (int и double)
        System.out.println("int + double = " + (c + e));
        System.out.println("int - double = " + (c - e));
        System.out.println("double - int = " + (e - c));
        System.out.println("double * int = " + (e * c));
        System.out.println("double / int = " + (e / c));
        System.out.println("double % int = " + (e % c));
    }
}
