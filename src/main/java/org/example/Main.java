package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Maven");
        System.out.println("Adding two numbers");

        int a = 5;
        int b = 10;
        System.out.println("Sum of " + a + " and " + b + " is " + sum(a, b));
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
