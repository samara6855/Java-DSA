package com.simha.java;

import java.util.Scanner;

public class LargestOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is larger");
        } else {
            System.out.println(num2 + " is larger");
        }
    }
}
