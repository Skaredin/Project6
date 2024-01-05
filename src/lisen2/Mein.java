package lisen2;
import java.util.Scanner;
public class Mein {

    public static void main(String[] args) {

        for (int i = 0; i <= 2; i++) {
            System.out.println("___________");
            System.out.println("Статичная цифра (в задание 0)");
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            System.out.println("До скольки отсчитать (Деапазон)");
            Scanner scanner2 = new Scanner(System.in);
            int k2 = scanner2.nextInt();
            StaticMethod.numberIncriment(k, k2);

        }
    }
}
class StaticMethod {
    private static int number;
    private static int number2;
    static int number3;
    static int number4;

    private static void Statick() {
        number = number3;
        number2 = number4;
    }
    public static void numberIncriment(int k, int k2) {
        number3 = k;
        number4 = k2;
        Statick();

        for (int t = 0; t <= number2 - 1; t++) {
            number++;

            int t2 = t + 1;
            if (number <= number2 - 1) {
                System.out.println("№" + t2 + " статиическое поле увиличивается на 1 ед- " + number);
            } else {

                System.out.println("№" + t2 + " конец статиическое поле- " + number);
            }
        }
    }
}