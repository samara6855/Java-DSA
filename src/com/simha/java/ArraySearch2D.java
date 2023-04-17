package com.simha.java;

import java.util.Arrays;

public class ArraySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 5},
                {6, 7, 8, 9},
                {11, 12, 15, 20},
                {25, 32, 46, 55}
        };
        int target = 32;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] Matrix,int target){
        int r = 0;
        int c = Matrix.length - 1;
        while( r< Matrix.length && c>=0){
            if(Matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(Matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
