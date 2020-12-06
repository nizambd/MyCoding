package com.mnu.problemsolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionProb_2 {
    public static void main(String[] args) {
        int x =659868985;
        System.out.println("Reverse of "+ x +" is  :"+ reverse(x));
    }

    // reversing an integer
    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }


}
