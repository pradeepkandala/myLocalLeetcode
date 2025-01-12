package arrays101;

import java.util.HashMap;

public class IntToRoman {
    public static void main(String[] args){

        String roman = intToRoman(5);
        System.out.print(roman);
    }

    public static String intToRoman(int num) {
        HashMap<String,Integer> romanVals = new HashMap<>();
        romanVals.put("I",1);
        romanVals.put("V",5);
        romanVals.put("X",10);
        romanVals.put("L",50);
        romanVals.put("C",100);
        romanVals.put("D",500);
        romanVals.put("M",1000);
        romanVals.put("IV",4);
        romanVals.put("IX",9);
        romanVals.put("XL",40);
        romanVals.put("XC",90);
        romanVals.put("CD",400);
        romanVals.put("CM",900);
        StringBuilder sb = new StringBuilder();
        while(num % 1000 > 0 && num > 999){
            sb.append("M");
            num = num - 1000;
        }
        if(num % 500 > 400 && num > 500){
            sb.append("CM");
            num = num - 900;
        }
        if(num % 500 < 400 && num > 499){
            sb.append("D");
            num = num - 500;
        }/*
        if (num % 500 > 400){
            sb.append("CM");
            num = num - 900;
        }*/
        while(num % 100 > 0 && num > 99){
            sb.append("C");
            num = num -100;
        }
        if(num % 50 > 40 && num > 50){
            sb.append("XC");
            num = num - 90;
        }
        if(num % 50 < 40 && num > 50){
            sb.append("L");
            num = num - 50;
        }
        if (num % 50 > 40){
            sb.append("XL");
            num = num - 40;
        }
        while(num % 10 > 0 && num > 9){
            sb.append("X");
            num = num - 10;
        }
        if(num ==  9 ){
            sb.append("IX");
            num = 0;
        }
        if(num % 5 > 3 && num > 5){
            sb.append("IX");
            num = num - 9;
        }
        if(num % 5 < 3 && num >= 5){
            sb.append("V");
            num = num - 5;
        }


        if(num == 4){
            sb.append("IV");
            num = 0;
        }
        while(num > 0){
            sb.append("I");
            num = num - 1;
        }
    return sb.toString();
    }
}
