
package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:/Users/Gary/Desktop/PokerHands.txt");
        BufferedReader reader = new BufferedReader(file);

        String text = "";
        String line = reader.readLine();


        while (line != null) {
            text += line;
            line = reader.readLine();
            String firstHand = text.substring(0, (text.length() / 2));
            String secondHand = text.substring((text.length() / 2));
            System.out.println(firstHand);
            counterMethod(firstHand);






        }
        System.out.println(text);
    }

    public static void counterMethod(String hand) {
        int twoCounter = 0;
        int threeCounter = 0;
        int fourCounter = 0;
        int fiveCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        int eightCounter = 0;
        int nineCounter = 0;
        int tenCounter = 0;
        int jackCounter = 0;
        int queenCounter = 0;
        int kingCounter = 0;
        int aceCounter = 0;
        int clubCounter = 0;
        int heartCounter = 0;
        int spadeCounter = 0;
        int diamondCounter = 0;

        for (int i = 0; i < hand.length(); i++) {
            char stringElement = hand.charAt(i);
            if (stringElement == '2') {
                twoCounter++;
            } else if (stringElement == '3') {
                threeCounter++;
            } else if (stringElement == '4') {
                fourCounter++;
            } else if (stringElement == '5') {
                fiveCounter++;
            } else if (stringElement == '6') {
                sixCounter++;
            } else if (stringElement == '7') {
                sevenCounter++;
            } else if (stringElement == '8') {
                eightCounter++;
            } else if (stringElement == '9') {
                nineCounter++;
            } else if (stringElement == 'T') {
                tenCounter++;
            } else if (stringElement == 'J') {
                jackCounter++;
            } else if (stringElement == 'Q') {
                queenCounter++;
            } else if (stringElement == 'K') {
                kingCounter++;
            } else if (stringElement == 'A') {
                aceCounter++;
            } else if (stringElement == 'C') {
                clubCounter++;
            } else if (stringElement == 'H') {
                heartCounter++;
            } else if (stringElement == 'S') {
                spadeCounter++;
            } else if (stringElement == 'D') {
                diamondCounter++;
            }

        }

    }
}
