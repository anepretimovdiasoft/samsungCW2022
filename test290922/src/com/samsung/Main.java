package com.samsung;

public class Main {

    public static void main(String[] args) {

        byte aByte = -128;
        short aShort = 30000;
        int aInt = 2000000000;
        long aLong = 20000000000l;

        System.out.println( aByte );
        System.out.println( aShort );
        System.out.println( aInt );

        double aDouble = 8.12312432542345;
        float aFloat = 8.2345325f;

        System.out.println( aFloat );

        boolean aBoolean = true;
        char aChar = 'a';

        System.out.println((int) (97.54645645) );

        int a = 11, b = 5;
        double res;

        res = a + b;
        System.out.println( res );

        res = a - b;
        System.out.println( res );

        res = a * b;
        System.out.println( res );

        res = a / b;
        System.out.println( res );

        res = a % b;
        System.out.println( res );

        int i = 0;

        System.out.println( ++i ); // i++ ; i = i + 1;
        System.out.println( i-- ); // i = i - 1;
        System.out.println( i );

        i += 5; // i = i + 5;
        i /= 2; // i = i / 2;
        i %= 2; // i = i % 2;
        i *= 2; // i = i * 2;
        i -= 2; // i = i - 2;

    }
}
