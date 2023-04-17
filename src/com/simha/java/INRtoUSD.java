package com.simha.java;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency in Rupees: ");
        float INR= sc.nextFloat();
        float USD = toUSD(INR);
        System.out.println("Currency in USD: " + USD);
    }

    private static float toUSD(float inr) {
        float x = (float) (inr * 0.012);
        return x;
    }
}
