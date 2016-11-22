package com.company;
/*
        Project Euler

        The sum of the squares of the first ten natural numbers is,

        (1)2 + (2)2 + ... + (10)2 = 385
        The square of the sum of the first ten natural numbers is,

        (1 + 2 + ... + 10)2 = 55(2) = 3025
        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class Main {

    public static void main(String[] args) {

        methods object1 = new methods();
        int array[] = new int[101];
        
        int arrayTotal = 0 ;
        int preSquaredTotal = 0;
        int tempTotal = 0;
        int postSquaredTotal = 0;

        for(int i =0; i < array.length; i++){
            array[i] += i;
        }

        for (int x: array){
            arrayTotal += x;
        }

        for(int i =0; i < array.length; i++){
            tempTotal = object1.pow(i,2);
            postSquaredTotal += tempTotal;
        }

        preSquaredTotal = object1.pow(arrayTotal,2);

        System.out.println(preSquaredTotal - postSquaredTotal);
}

static class methods {

    int pow(int base, int power) {
        if (power == 0) return 1;
        return base * pow(base, --power);
    }
}
}

//*Usage: Exponentiation
//*    Title : How to write a function that can calculate power in Java. No loops
//*    Author : user987339
//*    Date : 2016
//* Code version : -
//*    Availability : http://stackoverflow.com/questions/19425953/how-to-write-a-function-that-can-calculate-power-in-java-no-loops