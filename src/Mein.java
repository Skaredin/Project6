import java.util.Scanner;

public class Mein {

    public static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[a-zA-Z0-9]*$");
    }

    public static void main(String[] args) {

        Mein2 Mein2 = new Mein2();

        System.out.println("Какой символ");
        Scanner scanner = new Scanner(System.in);
        String k = scanner.nextLine();
        System.out.println("Какая буква");
        Scanner scanner2 = new Scanner(System.in);
        String k2 =  scanner2.nextLine();

        boolean b = isAlphaNumeric(k);
        boolean b2 = isAlphaNumeric(k2);
        char s;
        char s2;

        if (k == "") {
            s = Character.MIN_VALUE;
            s2 = k2.charAt(0);
        } else if (k2 == "") {
            s = k.charAt(0);
            s2 = Character.MIN_VALUE;
        }
        else {
            s = k.charAt(0);
            s2 = k2.charAt(0);
        }

        Mein2.assignmentMethod(s, s2, b, b2, k, k2);
        Mein2.showResults();
    }
}
class Mein2 {
    String secondSymbolCharS;
    String firstSymbolCharS;
    boolean firstSymbol1;
    boolean secondSymbol1;
    char firstSymbolChar;
    char secondSymbolChar;

    void assignmentMethod(char one, char two, boolean b, boolean b2, String k,  String k2) {

        secondSymbolCharS =  k2;
        firstSymbolCharS =k;
        firstSymbolChar = one;
        secondSymbolChar = two;
        firstSymbol1 = b;
        secondSymbol1 = b2;

    }
    void showResults() {


        if (firstSymbol1 == false & secondSymbol1 == true) {
            System.out.println("Символьное значение(Сhar): " + firstSymbolChar+ ", Текстовое значение(Сhar): " + secondSymbolChar+ ". Текстовое значение(String): " + secondSymbolCharS);
        } else if (firstSymbol1 == true & secondSymbol1 == false) {
            System.out.println("Символьное значение(Сhar): " + secondSymbolChar+ ", Текстовое значение(Сhar): " + firstSymbolChar+ ". Текстовое значение(String): " + firstSymbolCharS);
        }
        else if (firstSymbolChar != Character.MIN_VALUE & secondSymbolChar == Character.MIN_VALUE) {
            System.out.println("Число пустое значения: " + secondSymbolChar + ". Текстовое значение(String): " + firstSymbolCharS + ", Текстовое значение(Сhar): " + firstSymbolChar);
        }
        else if (secondSymbolChar != Character.MIN_VALUE & firstSymbolChar == Character.MIN_VALUE) {
            System.out.println("Число пустое значения: " + firstSymbolChar + ". Текстовое значение(String): " + secondSymbolCharS + ", Текстовое значение(Сhar): " + secondSymbolChar);
        }
        else {
            System.out.println("Текстовое поле : " + firstSymbolCharS + " + " +secondSymbolCharS + ", Текстовое значение(Сhar): " + firstSymbolChar+ ", " + secondSymbolChar );
        }
    }
}
