import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String check = "the";
        System.out.println(input.toLowerCase().indexOf(check));
    }
}