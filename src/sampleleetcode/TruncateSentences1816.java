package sampleleetcode;

public class TruncateSentences1816 {
    public static void main(String[] args){

       String s = "What is the solution to this problem";
       int k = 4;
       String result= truncateSentence(s,k);
       System.out.print(result);

    }

    public static String truncateSentence(String s, int k) {
        String[] str= s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(str[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

}
