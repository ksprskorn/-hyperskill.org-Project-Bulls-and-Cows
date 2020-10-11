import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c' || input.charAt(i) == 'g') {
                count++;
            }
        }
        System.out.println((double) count / input.length() * 100);

    }
}