package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int numberOfAges;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("How many ages are you telling me? ");
        numberOfAges= myScanner.nextInt();
        System.out.println("Ok, now tell me the " + numberOfAges + " ages and I will calculate how many candles you need: ");
        for (int i = 0; i < numberOfAges; i++) {
            int ageInput = myScanner.nextInt();
            System.out.println(calculateCandles(ageInput));
        }
        }

        public static String calculateCandles(Integer nextAge){
            return Integer.toBinaryString(nextAge);

        }
    }