package arrays101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GeekDuplicates {
    public static void main(String[] args){

    }

    public List<Integer> findDuplicates(int[] arr) {


//        Arrays.sort(arr);
//        List<Integer> duplicates = new ArrayList<>();
//
//        for(int i=0;i< arr.length-1; i++){
//            if(arr[i]== arr[i+1] && !duplicates.contains(arr[i]))
//                duplicates.add(arr[i]);
//        }
//        return duplicates;

        HashMap<Integer,Integer> arrayCount = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int j : arr) {
            int value = arrayCount.getOrDefault(j, 0);
            if (value == 0) {
                arrayCount.put(j, 1);
            } else {
                arrayCount.put(j, 1 + value);
                if (!duplicates.contains(j)) {
                    duplicates.add(j);
                }

            }
        }
        return duplicates;

    }
}
