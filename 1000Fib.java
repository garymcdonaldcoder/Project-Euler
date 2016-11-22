package com.company;


public class Main {

    public static void main(String[] args) {
      /*  The Fibonacci sequence is defined by the recurrence relation: Problem 25

        Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
        Hence the first 12 terms will be:

        F1 = 1
        F2 = 1
        F3 = 2
        F4 = 3
        F5 = 5
        F6 = 8
        F7 = 13
        F8 = 21
        F9 = 34
        F10 = 55
        F11 = 89
        F12 = 144
        The 12th term, F12, is the first term to contain three digits.

        What is the index of the first term in the Fibonacci sequence to contain 1000 digits?*/

        int num1 = 1;
        int num2 = 2;
        int newNum = 0;
        int index = 2;
        int answer = 0;
        int flag = 1;

        do {
            newNum = num1 + num2;
            num1 = num2;
            num2 = newNum;

            if(num2 > 1000){
                answer = num2;
                flag = 0;
                index++;
            }
            index++;
        } while (flag == 1);

        System.out.println(answer);
        System.out.println(index);

    }
}
