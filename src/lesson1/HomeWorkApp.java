package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        int a = 47;
        int b = -48;
        checkSumSign(a, b);
        int value = 101;
        printColor(value);
        compareNumbers(a, b);
    }

    // Задание-2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // Задание-3
    public static void checkSumSign (int a, int b) {
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // Задание-4
    public static void printColor (int value){
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    // Задание-5
    public static void compareNumbers (int a, int b) {
        if (a >=b) {
            System.out.println ("a>=b");
        } else {
            System.out.println ("a<b");
        }
    }

}