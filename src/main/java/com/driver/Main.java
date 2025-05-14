package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        System.out.println(p.product(4,5));
        System.out.println(p.product(45,678,45));
        System.out.print(p.product(4.56,5.78));
    }
}