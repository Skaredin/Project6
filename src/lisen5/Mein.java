package lisen5;

import java.util.Scanner;

public class Mein {

    public static void main(String[] args) {


        System.out.println("Степень");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        stepen.foo(k);
    }

    public class stepen {
        static int foo(int n) {
            int n2 = n;
            int res = 0;

            res = n2 * (n2 + 1) * (2 * n2 + 1) / 6;

            System.out.println("Результат "+ res);
            return n2;
        }
    }
}