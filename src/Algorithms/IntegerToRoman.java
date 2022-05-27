package Algorithms;
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder st = new StringBuilder();
        if(num>=1000){
            st.append(String.valueOf("M").repeat(num/1000));
            num = num % 1000;
        }
        if (num >= 900) {
            st.append(String.valueOf("CM").repeat(num/900));
            num = num % 900;
        } else if (num>=500) {
            st.append(String.valueOf("D").repeat(num/500));
            num = num% 500;
        }
        if (num >= 400) {
            st.append(String.valueOf("CD").repeat(num/400));
            num = num  % 400;
        } else if (num>=100) {
            st.append(String.valueOf("C").repeat(num/100));
            num = num  % 100;
        }
        if (num >= 90) {
            st.append(String.valueOf("XC").repeat(num/90));
            num = num % 90;
        } else if (num>=50) {
            st.append(String.valueOf("L").repeat(num/50));
            num = num %  50;
        }
        if (num >= 40) {
            st.append(String.valueOf("XL").repeat(num/40));
            num = num %  40;
        } else if(num>=10) {
            st.append(String.valueOf("X").repeat(num/10));
            num = num %  10;
        }
        if (num >= 9) {
            st.append(String.valueOf("IX").repeat(num/9));
            num = num % 9;
        } else if(num>=5){
            st.append(String.valueOf("V").repeat(num/5));
            num = num %  5;
        }
        if (num >= 4) {
            st.append(String.valueOf("IV").repeat(num/4));
            num = num % 4;
        } else if (num>=1) {
            st.append(String.valueOf("I").repeat(num));
        }
        return st.toString();
    }

}
