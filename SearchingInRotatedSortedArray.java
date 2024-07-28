package binarysearch;

import java.util.Scanner;

public class SearchingInRotatedSortedArray {
    public static int searchInRotatedSortedArray(int[] arr, int element) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == element) return mid;
            if (arr[mid] >= arr[start]) {
                if (element >= arr[start] && element < arr[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (element > arr[mid] && element <= arr[end]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};
        int result1 = searchInRotatedSortedArray(arr1, new Scanner(System.in).nextInt());
        System.out.println(result1);
    }
}