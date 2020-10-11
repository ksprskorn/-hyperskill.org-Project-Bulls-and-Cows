import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        double seed;
        Random random;
        boolean cond;
        while (true) {
            random = new Random(k);
            cond = true;
            for (int i = 0; i < n; i++) {
                seed = random.nextGaussian();
                if (seed > m) {
                    cond = false;
                }
            }
            if (cond) {
                System.out.println(k);
                break;
            }
            k++;
        }
    }
}