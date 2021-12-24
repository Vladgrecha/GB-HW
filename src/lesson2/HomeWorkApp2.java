package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        int a = 11;
        int b = -1;
        if (checkSum (a, b)) {
            System.out.println("Сумма лежит в промежутке 10-20");
        } else {
            System.out.println("Сумма лежит за пределами 10-20");
        }
        }

        //Задани-1
    public static boolean checkSum (int a, int b){
        return (a + b) > 9 && (a + b) < 21;
    }

        //Задание-2
    }
