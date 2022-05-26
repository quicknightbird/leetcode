package Algorithms;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int digital;
        while (!set.equals(n)) // checking for availability numbers
        {
            int count = 0;
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
                System.out.println(n);
                set.add(n); // add number in set
            }
        }
        return false;
    }
}
