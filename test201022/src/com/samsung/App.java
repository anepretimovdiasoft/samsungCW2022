package com.samsung;

public class App {

    public static void main(String[] args) {

        int[][] arr = new int[10][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[(int) (Math.random() * 10)];
        }


        fillArray(arr, 50);
        printArray(arr);

    }

    public static void fillArray(int[][] arr, int limit) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * limit);
            }
        }
    }

    public static void printArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

}
