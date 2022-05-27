package Algorithms;

import java.util.ArrayList;

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder st = new StringBuilder();
        if(num>=1000){
            st.append("M".repeat(num/1000));
            num = num % 1000;
        }
        if (num >= 900) {
            st.append("CM".repeat(num/900));
            num = num % 900;
        } else if (num>=500) {
            st.append("D".repeat(num/500));
            num = num% 500;
        }
        if (num >= 400) {
            st.append("CD".repeat(num/400));
            num = num  % 400;
        } else if (num>=100) {
            st.append("C".repeat(num/100));
            num = num  % 100;
        }
        if (num >= 90) {
            st.append("XC".repeat(num/90));
            num = num % 90;
        } else if (num>=50) {
            st.append("L".repeat(num/50));
            num = num %  50;
        }
        if (num >= 40) {
            st.append("XL".repeat(num/40));
            num = num %  40;
        } else if(num>=10) {
            st.append("X".repeat(num/10));
            num = num %  10;
        }
        if (num >= 9) {
            st.append("IX".repeat(num/9));
            num = num % 9;
        } else if(num>=5){
            st.append("V".repeat(num/5));
            num = num %  5;
        }
        if (num >= 4) {
            st.append("IV".repeat(num/4));
        } else if (num>=1) {
            st.append("I".repeat(num));
        }
        return st.toString();
    }
    public String intToRoman2 (int num){
        int[] intNumbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romsNumbers = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder st = new StringBuilder();
        for (int i = 0; num > 0; i++)
            while (num >= intNumbers[i]) {
                st.append(romsNumbers[i]);
                num -= intNumbers[i];
            }
        return st.toString();
        }
}
