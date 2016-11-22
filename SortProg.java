/* Project Euler
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
    // Overcomplicated to the extreme! But just for fun!
package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        methods m1 = new methods();
        int base = 0;
        int power = 0;
        int tempAnswer = 0;
        int finalAnswer = 1;

        int arrayOfPrimes[];
        arrayOfPrimes = m1.returnPrimes();

        int arrayOfPowers[];
        arrayOfPowers = m1.returnPowers(arrayOfPrimes);

        int multlples[] = new int[arrayOfPrimes.length];

        for(int i = 0; i < arrayOfPowers.length; i++){
            base = arrayOfPrimes[i];
            power = arrayOfPowers[i];
            tempAnswer = m1.pow(base,power);
            multlples[i] = tempAnswer;
        }

        for(int i = 0; i < multlples.length; i++){
            finalAnswer *= multlples[i];
        }
        
        System.out.println(finalAnswer);

    }
}

class methods {

    int pow(int base, int power) {
        if (power == 0) return 1;
        return base * pow(base, --power);
    }

//*Usage: Exponentiation
//*    Title : How to write a function that can calculate power in Java. No loops
//*    Author : user987339
//*    Date : 2016
//* Code version : -
//*    Availability : http://stackoverflow.com/questions/19425953/how-to-write-a-function-that-can-calculate-power-in-java-no-loops

    int [] returnPowers(int[] arrayOfPrimes){

        int arrayOfPowers[] = new int[arrayOfPrimes.length];
        Arrays.fill(arrayOfPowers, 1);

        int base = 0;
        int power = 0;
        int tempAnswer = 0;
        int answer = 0;
        for(int i = 0; i < arrayOfPrimes.length; i++){
            for(int j = 2; j < 5; j++){
                base = arrayOfPrimes[i];
                power = j;
                if(pow(base,power) < 20){
                    tempAnswer = pow(base,power);
                    answer = (int) Math.sqrt(tempAnswer);
                    arrayOfPowers[i] = answer;
                    power = answer;
                    if(pow(base,power) > 20){
                        answer--;
                        arrayOfPowers[i] = answer;
                    }
                }
            }
        }

        return arrayOfPowers;
    }

    int[] returnPrimes() {
        int array[] = new int[20];
        int num = 0;

        for (int i = 1; i <= 20; i++) {
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
        int[] arrayOfPrimes = new int[j];
        System.arraycopy(array, 0, arrayOfPrimes, 0, j);

        return arrayOfPrimes;
    }
}

//*Usage: Remove all zeros from array
//*    Title : Remove all zeros from array
//*    Author : Mike Nakis
//*    Date : 2016
//* Code version : -
//*    Availability :  // http://stackoverflow.com/questions/8777217/remove-all-zeros-from-array



