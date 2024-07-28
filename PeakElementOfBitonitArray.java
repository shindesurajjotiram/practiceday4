package binarysearch;

public class PeakElementOfBitonitArray {
    static int findPeakElement(int[] nums,int  start,int  end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[mid + 1]) end = mid;
            else start = mid + 1;
        }
        System.out.println(nums[start]);
        return start;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,4,2};
        System.out.println(findPeakElement(arr,0,arr.length-1));
    }
}
