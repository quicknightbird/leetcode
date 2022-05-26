package Algorithms;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int digital;
        while (set.add(n)){ //  change, it was an infinite loop and when it adds "n", if that number is set
            int count = 0;              // it responds true and repeats the loop, and if already there, then false it over
            while (n > 0) {
                digital = n % 10;
                count += digital * digital;
                n /= 10;
            }
            if (count == 1) { // checking for sum = 1 or not
                System.out.println(set);
                return true;
            } else {
                n = count;
            }
        }
        return false;
    }
}
