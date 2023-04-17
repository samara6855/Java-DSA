package com.simha.java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of fibonacci sequence: ");
        int range = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        if(range==0){
            System.out.println("0");
        }else if(range==1){
            System.out.println("0 1");
        }else{
            System.out.print("0 1");
            for(int i=0;i<=range;i++){
                n3=n1+n2;
                System.out.print(" " + n3);
                n1=n2;
                n2=n3;
            }
        }
    }
}
