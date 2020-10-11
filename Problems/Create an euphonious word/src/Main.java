import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String vowels = "aeiouy";
        int numberOfChar = 0;
        for (int i = 0; i < input.length(); i++) {
            if (vowels.contains(input.substring(i, i + 1))) {
                input = input.replace(Character.toString(input.charAt(i)), "a");
            } else {
                input = input.replace(Character.toString(input.charAt(i)), "b");
            }
        }
        for (int i = 0; i < input.length() - 2; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i + 1) == input.charAt(i + 2)) {
                if (vowels.contains(input.substring(i, i + 1))) {
                    input = input.substring(0, i + 2).concat("b").concat(input.substring(i + 2, input.length()));
                    numberOfChar++;
                } else {
                    input = input.substring(0, i + 2).concat("a").concat(input.substring(i + 2, input.length()));
                    numberOfChar++;
                }
            }
        }
        System.out.print(numberOfChar);
    }
}