package greek.dp;

public class FibonaccidpTabular {
    public static void main(String[] args){
        int n = 20;
        System.out.print(findFibTabular(n));
    }

    private static int findFibTabular(int n) {
        int[] fibTable = new int[n+1];
        fibTable[0] = 1;
        fibTable[1] = 1;
        for(int i = 2; i <= n; i++){
            fibTable[i] = fibTable[i-1] + fibTable[i-2];
            System.out.println(fibTable[i]);
        }
        return fibTable[n];
    }
}
