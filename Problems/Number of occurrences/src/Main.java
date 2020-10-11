import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String subText = scanner.nextLine();
        int count = 0;
        while (string.contains(subText)) {
            count++;
            string = string.substring(string.indexOf(subText) + subText.length(), string.length());
        }
        System.out.println(count);
    }
}