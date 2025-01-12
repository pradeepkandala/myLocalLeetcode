package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3_15 {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> response= threeSum(nums);
        System.out.print(response);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listArrayList= new ArrayList<>();
        Arrays.sort(nums);

        List<Integer> integerList = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        if(integerList.get(0) == 0 && integerList.get(1) == 0 && integerList.get(2) == 0)
        {
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(0);
            list.add(0);
            listArrayList.add(list);
            integerList.removeAll(list);
        }
        int i = 0;
        int j = integerList.size()-1;
       // while (integerList.size() > 3 || integerList.get(0) > 0 || integerList.get(integerList.size()-1) < 0) {
        while(i < j && integerList.size() >= 3){

            int sum = integerList.get(i) + integerList.get(j);
            if(integerList.indexOf(-1*sum) != i && integerList.indexOf(-1*sum) != j && integerList.contains(-1*sum)){
                List<Integer> list = new ArrayList<>();
                list.add(integerList.get(i));
                list.add(integerList.get(j));
                list.add(sum);
                listArrayList.add(list);
                integerList.removeAll(list);
            } else if(sum > 0){
                j--;
            } else if(sum < 0){
                i++;
            }

        }
        return  listArrayList;
    }
}
