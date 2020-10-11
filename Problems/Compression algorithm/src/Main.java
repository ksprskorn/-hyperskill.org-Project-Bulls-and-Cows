import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char prevChar = input.charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == prevChar) {
                prevChar = input.charAt(i);
                count++;
            } else {
                System.out.print(prevChar + "" + count);
                prevChar = input.charAt(i);
                count = 1;
            }
        }
        System.out.print(prevChar + "" + count);
    }

}
