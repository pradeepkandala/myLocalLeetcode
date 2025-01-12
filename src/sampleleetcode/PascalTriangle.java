package sampleleetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public static void main(String args[]){
        int n = 5;
        List<List<Integer>> pascal = findPascalTriangle(n);
    }

    private static List<List<Integer>> findPascalTriangle(int n) {
        List<List<Integer>> triangleArray = new ArrayList<>();
        for(int row = 0; row < n; row++){
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i <= row;i++) {

                if (row == i || i == 0){
                    arr.add(1);
                } else{
                    arr.add(triangleArray.get(row-1).get(i-1)+ triangleArray.get(row-1).get(i));
                }

            }
            triangleArray.add(arr);
        }
        return triangleArray;
    }
}
