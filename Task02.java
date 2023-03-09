import java.util.Scanner;

//2. Написать метод, который определяет, является ли год високосным, и возвращает boolean 
//(високосный - true, не високосный - false). Каждый 4-й год является високосным, 
//кроме каждого 100-го, при этом каждый 400-й – високосный.

public class Task02 {
    public static void main(String[] args) {
        Scanner leapYear = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = leapYear.nextInt();
        if (year % 4 == 0) {
            if (((year % 100 != 0) || (year % 400 == 0)))
                System.out.println("Этот год високосный !");
        } else {
            System.out.println("Этот год невисокосный !");
        }
    }

}
