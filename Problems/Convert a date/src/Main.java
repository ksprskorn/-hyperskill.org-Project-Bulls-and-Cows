import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String day = input.substring(8, 10);
        String month = input.substring(5, 7);
        String year = input.substring(0, 4);
        System.out.println(month + "/" + day + "/" + year);
    }
}
