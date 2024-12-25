package sampleleetcode;

import java.util.*;

public class ReverseVowels {
    public static void main(String[] args){
        String s = "IceCreAm";
        System.out.print(reverseVowels(s));

    }
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while(i <= j){
            if(!vowels.contains(ch[i])){
                i++;
            } else if(!vowels.contains(ch[j])){
                j--;
            } else if(vowels.contains(ch[i]) && vowels.contains(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++; j--;
            }
        }
        return new String(ch);
    }
}
