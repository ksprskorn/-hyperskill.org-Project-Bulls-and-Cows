import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String revers = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            revers += input.charAt(i);
        }
        System.out.println(input.equals(revers) ? "yes" : "no");
    }
}