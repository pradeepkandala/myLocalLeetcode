package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class KthFactorOfN1492 {
    public static void main(String[] args){
        int kThFactor = kthFactor(7,2);
        System.out.print(kThFactor);

    }
    public static int kthFactor(int n, int k) {
        List<Integer> factorList = new ArrayList<>();

        for(int i = 1; i <= n ;i++){
            if(n % i == 0){
                factorList.add(i);
            }
        }
        if(factorList.size() >= k)
            return factorList.get(k-1);
        else
            return -1;
    }
}
