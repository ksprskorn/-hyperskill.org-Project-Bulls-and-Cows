import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum1 = Character.getNumericValue(input.charAt(0))
                + Character.getNumericValue(input.charAt(1))
                + Character.getNumericValue(input.charAt(2));
        int sum2 = Character.getNumericValue(input.charAt(3))
                + Character.getNumericValue(input.charAt(4))
                + Character.getNumericValue(input.charAt(5));
        System.out.println(sum1 == sum2 ? "Lucky" : "Regular");

    }
}
