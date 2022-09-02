package com.robgleason.trivia;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
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

        System.out.println("3. What is the rarest blood type?\n" +
                "a) O\n" +
                "b) A\n" +
                "c) B\n" +
                "d) AB-Negative");
        String question3 = scan.nextLine();

        System.out.println("4. Which one of these character is friends with Harry Potter?\n" +
                "a) Ron Weasley\n" +
                "b) Hermione Granger\n" +
                "c) Draco Malfoy");
        String question4 = scan.nextLine();
        scan.close();

        if (Objects.equals(question1, "c")) {
            score += 5;

        }
        if (Objects.equals(question2, "a")) {
            score += 5;

        }
        if (Objects.equals(question3, "d")) {
            score += 5;
        }
        if (Objects.equals(question4, "a") || Objects.equals(question4, "b"))
            score += 5;

        if (score >= 15) {
            System.out.println("Wow,you know your stuff!");
            System.out.println("Your final score is " + score);
        } else if (score < 15 && score >= 5) {
            System.out.println("Not Bad!");
            System.out.println("Your final score is " + score);
        } else {
            System.out.println("Better luck next time");
            System.out.println("Your final score is " + score);
        }
    }
}
