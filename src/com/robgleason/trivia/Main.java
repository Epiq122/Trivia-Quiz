package com.robgleason.trivia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?\n" +
                "a) China\n" +
                "b) Ireland\n" +
                "c) Brazil\n" +
                "d) Italy");
        String question1 = scan.nextLine();

        System.out.println("2. Which planet is the hottest?\n" +
                "a) Venus\n" +
                "b) Saturn\n" +
                "c) Mercury\n" +
                "d) Mars");
        String question2 = scan.nextLine();

        System.out.println("3. WHat is the rarest blood type?\n" +
                "a) O\n" +
                "b) A\n" +
                "c) B\n" +
                "d) AB-Negative");


    }
}
