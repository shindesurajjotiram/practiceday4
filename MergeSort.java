package sortingtechniques;


import java.util.Arrays;

public class MergeSort {
    static void merge(int arr[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int M[] = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[p + i];
        for (int j = 0; j < n2; j++) M[j] = arr[q + 1 + j];
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
