package com.simha.java;

import static java.util.Arrays.binarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 10, 15, 25};
        int target =16;
        int ans = Search(arr,target);
        System.out.println(ans);
    }

    private static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
