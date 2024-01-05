package lisen3;
import java.util.stream.IntStream;

public class Mein {
    public static int[] v ;
    public static void main(String[] args) {

        v = new int[]{12,23,45,67,88,99};


        StaticMethod.syports();
    }
}
class StaticMethod {
    static void vaTest(int... v) {
        v =  Mein.v;
        System.out.println("Число аргументов: " + v.length);
        System.out.println("Содержимое: ");
        int maxNum = v[0];
        for (int j : v) {
            if (j > maxNum)
                maxNum = j;
        }
        int maxNum2 = v[0];
        for (int j : v) {
            if (j < maxNum2)
                maxNum2 = j;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(" Аргументы " + i + " содержимое в массивве: " + v[i]);
        }
        System.out.println();

        String se="Наибольшее число (в массиве): "+ maxNum+" Наименьшее число (в массиве): "+ maxNum2+" "+ IntStream.of(v).average();
        String see= se.replaceAll("OptionalDouble", "Среднее значение из массива: ");

        System.out.println(see);
    }
    public  static  void  syports(){
        StaticMethod vaTest = new StaticMethod();
        vaTest.vaTest();
    }
}