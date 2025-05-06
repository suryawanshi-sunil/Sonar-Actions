package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, SonarQube!");123
    }

    // Sample code issue: method not used
    private static void unusedMethod() {
        System.out.println("This method is never used");
    }
}
