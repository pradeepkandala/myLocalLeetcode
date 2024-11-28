package sampleleetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntBetterWay {
    public static void main(String[] args){
        /*
         * I             1
         * V             5
         * X             10
         * L             50
         * C             100
         * D             500
         * M             1000
         */
        String roman = "MCMXCIV";

        int num = findRomanToInt(roman);
        System.out.print(num);

    }

    private static int findRomanToInt(String roman) {

        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int result = 0;
        for(int i=0;i<roman.length();i++){
            int current = romanMap.get(roman.charAt(i));
            if( i+1 < roman.length() && romanMap.get(roman.charAt(i+1)) > current){
                result = result + current;
            } else
                result = result - current;
        }
        return result*-1;

    }
}
