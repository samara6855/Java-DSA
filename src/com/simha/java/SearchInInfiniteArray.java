package com.simha.java;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 12, 15, 16, 17, 21, 25, 36, 45, 76, 110, 150};
        int target = 17;
        int ans = ans(arr, target);
        System.out.println(ans);

    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) / 2;
            start = newStart;
        }
        return Search(arr, target, start, end);
    }
    static int Search(int[] arr, int target, int start, int end) {
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
        return mid;
    }
}
