package com.samsung;

import java.util.Scanner;

public class Main {

    static int d = 19;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int nextInt = scanner.nextInt();

        if (nextInt > 5) {
            System.out.println("nextInt > 5");
            System.out.println("!");
        } else {
            System.out.println("nextInt < 5");
            System.out.println("!");
        }*/

        /*int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b)
            if (a > c) System.out.println(a);
            else System.out.println(c);
        else
            if (b > c) System.out.println(b);
            else System.out.println(c);*/

        /*int n = scanner.nextInt();

        switch (n){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Указанный Вами номер месяца не существует!");
        }*/


        int a = 1;
        int b = 10;
        if (a > 0) {
            int c = 5;
            int d = 100;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            if (true) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
            }
        } else {

            System.out.println(a);
            System.out.println(b);

        }
        System.out.println(d);
    }
}
