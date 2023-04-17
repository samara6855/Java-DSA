package com.simha.java;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator");
        String choice = sc.next();
        switch(choice){
            case("+"):
                System.out.println("The sum is: " + (num1 + num2));
                break;
            case("-"):
                System.out.println("The difference is: " + (num1 - num2));
                break;
            case("*"):
                System.out.println("The product is: " + (num1 * num2));
                break;
            case("/"):
                System.out.println("The quotient is: " + (num1 / num2));
                break;
            case("%"):
                System.out.println("The remainder is: " + (num1 % num2));
                break;
            default:
                System.out.println("Enter correct choice");
        }
    }
}
