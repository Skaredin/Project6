package lisen8;
import java.util.Arrays;
import java.util.Scanner;

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
    }
}
class  statik {
    static char[] mas(char[] symb, int dlina) {
        int[] num = new int[dlina];
        int t = 0;

        int f = 0;
        for (int i = 0; i < dlina; i++) {
            num[i] = (int) symb[i];
            t++;
            System.out.println("Kодов символов: "+Arrays.toString(new int[]{num[i]})+ " - Aргумента: "+ Arrays.toString(new char[]{symb[i+t]}));
            t++;
            f = f + num[i];

        }
        String d = Arrays.toString(symb);
        d = d.replaceAll("[,.\\[\\]]", "");
        d = d.replaceAll("( )+", " ");
        System.out.println("Код символа: "+ Arrays.toString(num));
        System.out.println("Aргументы: ["+ d+"]");
        double average = 0;
        if (num.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < num.length; j++) {
                sum += num[j];
            }
            average = sum / num.length;
        }

        int g = f /dlina;
        System.out.println("\033[32;1m"+"Сумма: ["+ f+"] Dелённая сумма :[" +g + "] Среднее значение: ["+ average+"]"+" \033[0m");
        return symb;
    }
}