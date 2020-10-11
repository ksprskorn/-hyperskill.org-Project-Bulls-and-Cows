import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int seedWithMin = a;
        int sequenceMin = k;
        int maxSequence = 0;
        int currentSequence = 0;


        Random random;

        for (int i = a; i < b + 1; i++) {
            random = new Random(i);

            for (int j = 0; j < n; j++) {

                currentSequence = random.nextInt(k);
                maxSequence = currentSequence > maxSequence ? currentSequence : maxSequence;
            }
            if (maxSequence < sequenceMin) {
                sequenceMin = maxSequence;
                seedWithMin = i;
            }

            maxSequence = 0;
        }
        System.out.println(seedWithMin);
        System.out.println(sequenceMin);
    }
}
