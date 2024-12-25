package sampleleetcode;

public class IsPalindrom {
    public static void main(String[] args){
        String s = "0P";
        boolean isPalindrom = isPalindrome(s);
        System.out.print(isPalindrom);
    }
    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        String str = s.toLowerCase();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                sb.append(ch);
            }
        }
        int len = sb.length();


        for(int i=0; i < len/2; i++){
            if(sb.charAt(i) != sb.charAt(len-1-i)){
                return false ;
            }
        }
        return true;
    }
}
