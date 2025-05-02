package com.ironhack.javaKeywords;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //We ask user for a String call stringPhrase
        Scanner scanner = new Scanner(System.in);
        String stringPhrase = "";
        boolean validInput = false;

        do {
            System.out.println("Please write your phrase");
            if (scanner.hasNextLine()) {
                stringPhrase = scanner.nextLine();
                validInput = true;
            } else {
                System.out.println("That's not a valid input");
            }
        } while (!validInput);
        System.out.println("Your phrase is: " + stringPhrase);
        scanner.close();

        JavaKey jk = new JavaKey(stringPhrase);
        String foundJavKeyWords = jk.compareKeyString();
        System.out.println(foundJavKeyWords);

    }
}
