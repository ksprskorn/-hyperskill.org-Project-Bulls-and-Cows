package bullscows;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        int number;
        int numberOfPossibleSymbols;
        String characterList = "0123456789abcdefghijklmnopqrstuvwxyz";

        try {
            System.out.println("Please, enter the secret secretCode's length:");
            input = scanner.nextLine();
            number = Integer.parseInt(input);

            if (number > characterList.length() | number == 0) {
                System.out.println("Error: can't generate a secret number with a length of " + characterList.length() + " because there aren't enough unique digits.");
                return;
            }

            System.out.println("Input the number of possible symbols in the code:");
            numberOfPossibleSymbols = scanner.nextInt();

            if (numberOfPossibleSymbols > characterList.length() | numberOfPossibleSymbols == 0) {
                System.out.println("Error: maximum number of possible symbols in the code is " + characterList.length() + " (0-9, a-z).");
                return;
            }
            if (number > numberOfPossibleSymbols) {
                System.out.println("Error: it's not possible to generate a code with a length of " + number + " with " + numberOfPossibleSymbols + " unique symbols.");
                return;
            }

        String secretCode = "";


        Random random = new Random();
        int randomInt;
        String Symbol = "";

        while (secretCode.length() < number) {
            randomInt = random.nextInt(numberOfPossibleSymbols);
            Symbol = characterList.substring(randomInt, randomInt + 1);
            if (secretCode.contains(Symbol)) {
                continue;
            } else {
                secretCode += Symbol;
            }
        }

        System.out.print("The secret is prepared: ");
        for (int x = 0; x < number; x++) {
            System.out.print("*");
        }
        System.out.print(" (0"
                + (numberOfPossibleSymbols > 9 ? "-9, a" : "")
                + "-" + characterList.substring(numberOfPossibleSymbols - 1, numberOfPossibleSymbols) + ").\n");

        System.out.println("Okay, let's start a game!");
        int gameCount = 1;

        do {
            System.out.println("Turn " + gameCount + ":");

            String inputNumber = scanner.next();
            int cow = 0;
            int bull = 0;
            for (
                    int i = 0; i < inputNumber.length(); i++) {
                if (Character.toString(inputNumber.charAt(i)).equals(Character.toString(secretCode.charAt(i)))) {
                    bull++;
                } else {
                    for (int j = 0; j < secretCode.length(); j++) {
                        if (Character.toString(inputNumber.charAt(i)).equals(Character.toString(secretCode.charAt(j)))) {
                            cow++;
                        }
                    }
                }
            }
            if (bull == number) {
                System.out.println("Grade: "
                        + bull + " bull(s)\n"
                        + "Congratulations! You guessed the secret code.");
                break;
            } else {
                System.out.println("Grade: "
                        + (bull == 0 && cow == 0 ? "None" : "")
                        + (bull > 0 ? bull + " bull(s)" : "")
                        + (bull > 0 && cow > 0 ? " and " : "")
                        + (cow > 0 ? cow + " cow(s)" : ""));
                gameCount++;
            }

        } while (true);

        } catch (Exception e) {
            System.out.println("Error: \"" + input + "\" isn't a valid number.");
        }
    }
}
