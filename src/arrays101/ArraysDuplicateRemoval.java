package arrays101;

import java.util.ArrayList;
import java.util.List;

public class ArraysDuplicateRemoval {
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5,6,7,7};

        List<Integer> al = new ArrayList<>();

        for(int i = 0; i < arr.length ; i++){
            if(!al.contains(arr[i])){
                al.add(arr[i]);
            }
        }
        System.out.print(al);
    }
}
