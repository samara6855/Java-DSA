package com.simha.java;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount: ");
        int principleAmount = sc.nextInt();
        System.out.println(("Enter time: "));
        int time = sc.nextInt();
        System.out.println("Enter rate of interest: ");
        float rateOfInterest = sc.nextFloat();
        System.out.println("Simple Interest: "+ (principleAmount*time*rateOfInterest));
    }
}
