package arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllDublicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(List.of(4,3,5,4,6,7,8,7,6,9,2));
        for(int i=0;i<list.size();i++) {
            boolean dublicate=false;
            for(int j=0;j<list.size();j++) {
                if(i != j && list.get(i)==list.get(j)) {
                    dublicate=true;
                    break;
                }
            }
            if(!dublicate) {
                System.out.print(list.get(i)+" ");
            }
        }

    }
}
