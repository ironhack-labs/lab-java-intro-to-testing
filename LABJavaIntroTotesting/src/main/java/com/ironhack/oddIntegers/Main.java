package com.ironhack.oddIntegers;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //We ask user for a number call n
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;

        do {
            System.out.println("Please write an integer");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("That's not a valid integer. Try again");
                scanner.next();
            }

        } while (!validInput);
        System.out.println("Your integer is: " + n);

scanner.close();

NListGenerator generator = new NListGenerator(n);
        List<Integer> oddNumbers = generator.generateOddList();
        System.out.println("Odd numbers from 0 to " + n + ": " + oddNumbers);

    }
}
