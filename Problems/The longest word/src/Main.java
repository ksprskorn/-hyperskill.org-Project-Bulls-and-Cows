import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        int longerWord = 0;

        for (int i = 0; inputArray.length > i; i++) {
             if (inputArray[longerWord].length() < inputArray[i].length()) {
                 longerWord = i;
             }
        }
        System.out.println(inputArray[longerWord]);

    }
}