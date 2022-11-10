package com.samsung;

import com.samsung.model.Product;

public class App {

    public static void main(String[] args) {
        Product product1 = new Product(
                "Сыр",
                350,
                10
        );

        Product product2 = new Product(
                "Хлеб",
                50,
                100
        );



        System.out.println(product1);
    }
}
