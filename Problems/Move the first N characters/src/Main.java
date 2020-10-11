import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next().trim();
        int number = scanner.nextInt();

        System.out.println(text.length() < number ?
                text :
                text.substring(number, text.length()) +
                        text.substring(0, number));
    }
}