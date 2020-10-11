import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        if (alfabet.contains(input)) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }
}