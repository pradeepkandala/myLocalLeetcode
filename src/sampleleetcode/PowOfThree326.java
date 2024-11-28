package sampleleetcode;

public class PowOfThree326 {
    public static void main(String[] args){
        System.out.print(isPowerOfThree(27));
    }

    public static boolean isPowerOfThree(int n) {
        if(n <= 0 || n == 2){
            return false;
        }else if(n==1){
            return true;
        }
        if(n > 3 && n % 3 ==0){
            n = n/3;
            return isPowerOfThree(n);
        }
        return n == 3;
    }


}
