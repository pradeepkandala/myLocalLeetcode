package greek.dp;

public class Tribonacci {
    public static void main(String[] args){
        int n = 10;
        System.out.println(findTribonacci(n));
    }

    private static int findTribonacci(int n) {
        int[] tri = new int[n];
        tri[0] = 0;
        tri[1] = 0;
        tri[2] = 1;

        for(int i=3;i<n;i++){
            tri[i] = tri[i-3] + tri[i-2] + tri[i-1];
        }
        return tri[n-1];
    }
}
