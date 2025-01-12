package sampleleetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangel2 {
    public static void main(String[] args){
        List<Integer> arr = getRow(0);
        for(int i=0;i< arr.size();i++){
            System.out.print(" " + arr.get(i) + " ");
        }


    }
    public static List<Integer> getRow(int rowIndex) {

        List<List<Integer>> pascalTriangle2 = new ArrayList<>();
        if(rowIndex < 0){
            return new ArrayList<>();
        }
        for(int row = 0; row <= rowIndex; row++){
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i <= row; i++ ){
                if(row == i || i == 0)
                    arr.add(1);
                else {
                    arr.add(pascalTriangle2.get(row -1 ).get(i-1)+ pascalTriangle2.get(row-1).get(i));
                }
            }
            pascalTriangle2.add(arr);
        }
        return  pascalTriangle2.get(rowIndex);

    }
}
