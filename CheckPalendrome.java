package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckPalendrome {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<Integer>(List.of(4,5,4,5,4));
        ArrayList<Integer> list2=new ArrayList<Integer>(list1);
        Collections.reverse(list2);
        System.out.println(list1.equals(list2));
    }
}
