package org.example;

import model.Product;
import model.ProductCollection;

public class Main {
    public static void main(String[] args) {
        ProductCollection out = new ProductCollection();
        System.out.println(out);

        Product t1 = new Product();
        t1.setNameOfProduct("яблоко");
        System.out.println(t1);

        out.add(t1);
        System.out.println(out);
    }
}