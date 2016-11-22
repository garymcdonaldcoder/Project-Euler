package com.company;
/*
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
Find the sum of all numbers which are equal to the sum of the factorial of their digits.
Note: as 1! = 1 and 2! = 2 are not sums they are not included.
Problem 34   */

public class Main {

    public static void main(String[] args) {


        int counter = 3;
        int factTotal = 0;
        int finalAnswer = 0;

        do{
            String counterAsString = Integer.toString(counter);
            for(int i = 0; i < counterAsString.length(); i++){
                char StringElement  = counterAsString.charAt(i);
                int elementAsInt = Character.getNumericValue(StringElement);
                int fact = factorialCalc(elementAsInt);

                factTotal += fact;
                if(factTotal == counter){
                    finalAnswer += factTotal;
                }

            }
            factTotal = 0;
            counter++;

        }while(counter < 1000000);

        System.out.println(finalAnswer);

    }
    public static int factorialCalc(int element){
        int fact = 1;
        for (int i = 1; i <= element; i++) {
            fact *= i;
        }
        return fact;
    }
}


