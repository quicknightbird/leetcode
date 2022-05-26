
/*
Given a roman numeral, convert it to an integer.
Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999]
//Ⅰ（1） Ⅴ（5） Ⅹ（10） Ⅼ（50） Ⅽ（100） Ⅾ（500）and Ⅿ（1000）
*/
package Algorithms;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        int charr;
        int count = 0;
        if(s==null || s.length()>15|| s.length()==0){
            return 0;
        }
        Map<Character, Integer> RomanNumbers = Map.of('I', 1,'V', 5,'X',10,'L',50,'C',100,'D',500,'M',1000);
        int previous = RomanNumbers.get(s.charAt(0));
        for(int i = 1;  s.length()> i; i++){
            charr = RomanNumbers.get(s.charAt(i));
            if(charr>previous){
                count = count-previous;
            }else{
                count = count+previous;
            }
            previous = charr;
        }
        count+=previous;
        return count;
    }
}