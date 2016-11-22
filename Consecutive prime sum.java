package com.company;
import org.apache.commons.lang.ArrayUtils;

import java.util.stream.*;
/*
The prime 41, can be written as the sum of six consecutive primes:

        41 = 2 + 3 + 5 + 7 + 11 + 13
        This is the longest sum of consecutive primes that adds to a prime below one-hundred.

        The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

        Which prime, below one-million, can be written as the sum of the most consecutive primes?
*/

public class Main {

    public static void main(String[] args) {

        int array[] = new int[50];
        int num = 0;
        int sum = 0;

        for (int i = 1; i <= array.length; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) {
                array[i] += i;
            }


        }



        for (int i = array.length - 1; i >= 0; i--) {

            for (int k = 50; k >= 0; k--) {
                sum = IntStream.of(array).sum();
                if (sum != k) {
                    array = ArrayUtils.removeElement(array, i);
                }

            }


        }

        System.out.println(ArrayUtils.toString(array));
        System.out.println(sum);


        // System.out.println(ArrayUtils.toString(array));
    }
}





