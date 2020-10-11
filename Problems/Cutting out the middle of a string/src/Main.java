import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String partStart1 = input.substring(0, input.length() / 2 - 1);
        String partStart2 = input.substring(0, input.length() / 2);
        String partEnd = input.substring(input.length() / 2 + 1, input.length());
        System.out.print(input.length() % 2 == 0 ? partStart1 : partStart2);
        System.out.print(partEnd);
    }
}