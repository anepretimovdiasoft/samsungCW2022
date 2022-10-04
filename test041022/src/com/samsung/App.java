package com.samsung;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        String res = ( (y > 0) && (x * x + y * y > 4) && (x < 2) && (y < x)) ? "YES" : "NO";

        System.out.println(res);

    }

}
