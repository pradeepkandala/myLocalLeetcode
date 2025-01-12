package greek.dp;

import java.util.Arrays;

public class FibonacciDP {
    public static void main(String[] args){
        int n = 20;
        System.out.println(findFibbo(n));
    }

    private static int findFibbo(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        //System.out.println(Arrays.toString(memo));
        return fibRec(memo,n);
    }

    private static int fibRec(int[] memo, int n) {
        if(n <= 1){
            return 1;
        }
        if(memo[n] != -1){
            return  memo[n];
        }
        memo[n] = fibRec(memo,n-1) + fibRec(memo, n-2);
        return memo[n];
    }
}
