package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        int a = 11;
        int b = -1;
        int number = 0;
        int value = -1;
        int amount = 9;
        String someString = "bla-bla-bla";
        int year = 2016;

        System.out.println("************Ex-1************");
        if (checkSum(a, b)) {
            System.out.println("Сумма лежит в промежутке 10-20");
        } else {
            System.out.println("Сумма лежит за пределами 10-20");
        }

        System.out.println("************Ex-2************");
        if (isNumberPositive(number)) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        System.out.println("************Ex-3************");
        if (isNumberNegative(value)) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }

        System.out.println("************Ex-4************");
        printStrings(amount, someString);

        System.out.println("************Ex-5************");
        if (leapYear(year)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    //Задани-1
    public static boolean checkSum(int a, int b) {
        return (a + b) > 9 && (a + b) < 21;
    }

    //Задание-2
    public static boolean isNumberPositive(int number) {
        return number >= 0;
    }

    //Задание-3 *(0 по аналогии со вторым задание тоже учитываю как положительное число)*
    public static boolean isNumberNegative(int value) {
        return value < 0;
    }

    //Задание-4
    public static void printStrings(int amount, String someString) {
        for (int i = 1; i <= amount; i++) {
            System.out.print(i + ") ");
            System.out.println(someString);
        }
    }

    //Задние-5
    public static boolean leapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
         return true;
        } else {
            return false;
        }

        }
    }
