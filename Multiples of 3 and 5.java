package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

/*   If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
        Find the sum of all the multiples of 3 or 5 below 1000.*/
public class Main {

    public static void main(String[] args) {

        int totalof3 = 0;
        int totalof5 = 0;
        int multsof3[] = new int[1000];
        int multsof5[] = new int[1000];

        for(int i = 0;i < multsof3.length; i++){
            multsof3[i] += i;
            multsof5[i] += i;  // fill both arrays
        }
        for(int i = 0;i<multsof3.length;i++){
            if(multsof3[i] % 3== 0){       // if factor is divisible by 3, add to total
                totalof3 += i;
            }
        }
        for(int i = 0;i<multsof5.length;i++){
            if(multsof5[i] % 5 == 0){
                totalof5 += i;             // if factor is divisible by 5, add to total
            }
        }
        System.out.println(totalof3 + totalof5);    // add totals
    }
}
