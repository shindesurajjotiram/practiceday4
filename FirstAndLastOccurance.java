package binarysearch;

public class FirstAndLastOccurance {
    static int firstOccurance(int[] arr, int element) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > element) high = mid - 1;
            else if (arr[mid] < element) low = mid + 1;
            else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }

    static int lastOccurance(int[] arr, int element) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > element) high = mid - 1;
            else if (arr[mid] < element) low = mid + 1;
            else {
                res = mid;
                low=  mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int element = 8;
        System.out.println("First Occurrence of element = " + firstOccurance(arr, element));
        System.out.println("Last Occurrence of element = " + lastOccurance(arr, element));
    }
}