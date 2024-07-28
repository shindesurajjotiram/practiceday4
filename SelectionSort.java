package sortingtechniques;

import java.util.Arrays;

public class SelectionSort {
    static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElement = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElement])
                    minElement = j;
            }

            int temp = arr[minElement];
            arr[minElement] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}