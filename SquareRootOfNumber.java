package binarysearch;

public class SquareRootOfNumber {
    static int sqrt(int number) {
        int low = 0;
        int high = number;
        while (low <= high) {
            int mid = (low + high) / 2;
            int square = mid * mid;
            if (square == number) {
                return mid;
            } else if (square < number) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }
}
