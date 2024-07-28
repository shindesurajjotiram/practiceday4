package linearsearch;

import java.util.Arrays;

public class AllOccurancesInList {
    public static int countOfSpecificInteger(int[] arr,int number) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(number==arr[i]) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr=new int[]{4,3,4,5,6,7,8,9,2,3,1,4,5,6,7,8,9,6,4,5,3,2,1,6};
        int specificInteger=4;
        int countOfSpecificIntiger= countOfSpecificInteger(arr,specificInteger);
        int[] listOfIndices=new int[countOfSpecificIntiger];
        int index=0;
        for(int i=0;i<arr.length;i++) {
            if(specificInteger==arr[i]) listOfIndices[index++]=i;
        }
        System.out.println(Arrays.toString(listOfIndices));
    }
}
