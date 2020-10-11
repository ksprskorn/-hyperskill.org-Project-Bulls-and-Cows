import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            try {
                System.out.println(Integer.parseInt(input) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + input);
            }
        } while (scanner.hasNextLine());

    }
}
