import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text =  scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + "" + text.charAt(i));
        }

    }
}