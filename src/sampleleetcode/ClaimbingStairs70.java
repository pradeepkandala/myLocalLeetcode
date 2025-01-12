package sampleleetcode;

public class ClaimbingStairs70 {
    public static void main(String[] args){
     int n = 3;
     System.out.print(climbStairs(n));
    }
    public static int climbStairs(int n) {

        int[] claimbStair = new int[n+2];
        claimbStair[0] = 0;
        claimbStair[1] = 1;
        claimbStair[2] = 2;
        for(int i = 3; i <= n; i++) {
            claimbStair[i] = claimbStair[i - 1] + claimbStair[i - 2];
        }
        return claimbStair[n];

    }
}
