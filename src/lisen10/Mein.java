package lisen10;
import java.util.*;


public class Mein {
    public static void main(String[] args) {
        Scanner console2 = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = console2.nextInt();
        Scanner console = new Scanner(System.in);
        String[] array = new String[length];
        for (int i = 0; i < length; i++)
        {
            array[i] = console.nextLine();
        }
        char [] a = Arrays.toString(array).toCharArray();
        statik.mas(a, length);
        statik.Sort(a);
        statik.Sort2MaxMin();
    }
}
class  statik {
    static int[] sr;
    static int dlina2;
    static char[] mas(char[] symb, int dlina) {
        int[] num = new int[dlina];
        int t = 0;

        int f = 0;
        for (int i = 0; i < dlina; i++) {
            num[i] = (int) symb[i];
            t++;
            System.out.println("Kодов символов: " + Arrays.toString(new int[]{num[i]}) + " - Aргумента: " + Arrays.toString(new char[]{symb[i + t]}));

            t++;
            f = f + num[i];

        }
        String d = Arrays.toString(symb);
        d = d.replaceAll("[,.\\[\\]]", "");
        d = d.replaceAll("( )+", " ");
        System.out.println("Код символа: " + Arrays.toString(num));
        System.out.println("Aргументы: [" + d + "]");
        double average = 0;
        if (num.length > 0) {
            double sum = 0;
            for (int j = 0; j < num.length; j++) {
                sum += num[j];
            }
            average = sum / num.length;
        }
        int g = f / dlina;
        System.out.println("\033[32;1m" + "Сумма: [" + f + "] Dелённая сумма :[" + g + "] Среднее значение: [" + average + "]" + " \033[0m");

        sr = num;

        dlina2 = dlina;
        return symb;
    }

    static void Sort(char[] arr) {
        int t = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }

        int[] arr2 = sr;
        for (int i = 0; i < arr2.length / 2; i++) {

            int temp = arr2[i];
            arr2[i] = arr2[arr2.length - i - 1];
            arr2[arr2.length - i - 1] = temp;
        }
        for (int i = 0; i < dlina2; i++) {
            t++;

            System.out.println("\033[31;1m" + "Kодов символов: " + Arrays.toString(new int[]{sr[i]}) + " - Aргумента: " + Arrays.toString(new char[]{arr[i + t]}));
            t++;
        }
        String d = Arrays.toString(arr);
        d = d.replaceAll("[,.\\[\\]]", "");
        d = d.replaceAll("( )+", " ");
        System.out.println("Код символа: " + Arrays.toString(arr2));
        System.out.println("Aргументы: [" + d + "]" + " \033[0m");

    }
    static void Sort2MaxMin() {

            int[] numbers = sr;
            Arrays.sort(numbers);
            int min = numbers[0];
            int max = numbers[numbers.length - 1];
            System.out.println("\033[36;1m"+"Min: " + min);
            System.out.println("Max: " + max+ " \033[0m");
        }
    }