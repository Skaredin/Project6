package lisen6;
import java.util.Scanner;

public class Mein {

    public static void main(String[] args) {
        {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            int length = scanner.nextInt();
            int[] array = new int[length];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }

            int[] invertedArray = Program.InvertArray(array);
            Program.InvertArray(invertedArray);
        }
    }
    static class Program {
        static int[] InvertArray(int[] arr) {
            int[] invertedArr = new int[arr.length];


            StringBuilder strBuilder = new StringBuilder();

            for (int i = 0; i < arr.length; i++) {
                invertedArr[i] = arr[arr.length - i - 1];

                strBuilder.append(invertedArr[i]);
            }
            String newString = strBuilder.toString();
            System.out.println(newString);

            return invertedArr;
        }
    }
}
