package com.company;

/*
        Project Euler
        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

        What is the 10 001st prime number?

*/

public class Main {

    public static void main(String[] args) {

        int num = 0;
        int array[] = new int[110000];
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

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
                array[j++] = array[i];
        }

        System.out.println(array[10001]);
    }
}




