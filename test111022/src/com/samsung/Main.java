package com.samsung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n < 100){
            n += Math.random() * 10;
            System.out.println( n );
            if (n == 50) break;
        }

    }
}
