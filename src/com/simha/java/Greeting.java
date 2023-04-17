package com.simha.java;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = s.nextLine();
        System.out.println("Hi! "+ name +" Welcome to Java");
    }
}
