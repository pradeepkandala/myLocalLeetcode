import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayListExampleSample {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        for(int i=0;i<10;i++){
            Random rn = new Random();
            nums.add(rn.nextInt(100));
        }

        Collections.sort(nums);
        System.out.println(nums);
        nums.remove(9);
        nums.remove(6);
        nums.remove(6);
        System.out.println(nums);
    }
}
