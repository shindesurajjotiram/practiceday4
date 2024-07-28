package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchSortedArray {
    public static int binarySearchOnSortedArray(int[] arr,int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{3,2,1,4,5,6,7,8,9,21};
        Arrays.sort(arr);
        System.out.println(binarySearchOnSortedArray(arr, new Scanner(System.in).nextInt()));
    }
}
