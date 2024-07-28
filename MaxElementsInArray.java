package linearsearch;

public class MaxElementsInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 4, 4, 3, 3, 6, 7, 22, 3, 4, 444, 5, 6, 5, 66, 7, 7, 8, 8, 9, 6, 5, 34, 33, 43, 4, 6, 6, 46, 5, 42, 3, 45};
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxElement < arr[i]) maxElement = arr[i];
        }
        System.out.println("Max element : " + maxElement);
    }
}
