import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int requirements1 = scanner.nextInt();
        int requirements2 = scanner.nextInt();
        int requirements3 = scanner.nextInt();
        int requirements4 = scanner.nextInt();

        String rq1UppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String rq2LowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String rq3digits = "0123456789";
        String rq4all = rq1UppercaseLetters.concat(rq2LowercaseLetters).concat(rq3digits);

        String newPassword = "";

        Random rand = new Random();
        int randNumberCurrent = -1;
        int randNumber = -1;

        for (int a = 0; a < requirements1; a++) {
            do {
                randNumber = rand.nextInt(rq1UppercaseLetters.length());
            }
            while (randNumberCurrent == randNumber);
            randNumberCurrent = randNumber;
            newPassword = newPassword.concat(rq1UppercaseLetters.substring(randNumber, randNumber + 1));
        }
        for (int b = 0; b < requirements2; b++) {
            do {
                randNumber = rand.nextInt(rq2LowercaseLetters.length());
            }
            while (randNumberCurrent == randNumber);
            randNumberCurrent = randNumber;
            newPassword = newPassword.concat(rq2LowercaseLetters.substring(randNumber, randNumber + 1));
        }
        for (int c = 0; c < requirements3; c++) {
            do {
                randNumber = rand.nextInt(rq3digits.length());
            }
            while (randNumberCurrent == randNumber);
            randNumberCurrent = randNumber;
            newPassword = newPassword.concat(rq3digits.substring(randNumber, randNumber + 1));
        }
        requirements4 = requirements4 - requirements1 - requirements2 - requirements3;
        for (int d = 0; d < requirements4; d++) {
            do {
                randNumber = rand.nextInt(rq4all.length());
            }
            while (randNumberCurrent == randNumber);
            randNumberCurrent = randNumber;
            newPassword = newPassword.concat(rq4all.substring(randNumber, randNumber + 1));
        }

        System.out.print(newPassword);


    }
}