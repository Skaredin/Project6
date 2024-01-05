package lisen4;
import java.util.Scanner;

public class Mein {
    public static void main(String[] args) {

        for (int d = 0; d <= 1; d++) {
            System.out.println("Факториал в ведите");
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            Mein.Fact(k);

        }
    }
    static int Fact(int n) {
        int t = 0;
        int result = 1;
        for (int i = n % 2 == 0 ? 2 : 1; i <= n; i += 2) {
            t++;
            String str1 = Integer.toString(i);

            System.out.println("№" + t + " последовательность факториала:" + str1);
            result *= i;
        }

        System.out.println("Результат факториала: " + result);
        return result;
    }
}
