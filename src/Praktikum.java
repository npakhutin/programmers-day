import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        int numDay = 13;
        if (isLeapYear(year)) {
            numDay = 12;
        }

        System.out.println(numDay + ".09." + year);
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;

        // годы, номер которых кратен 4, — високосные
        // год, номер которого кратен 400, — високосный
        if (year % 4 == 0 || year % 400 == 0) {
            result = true;
        }
        // остальные годы, номер которых кратен 100, — не високосные
        if (year % 400 != 0 && year % 100 == 0) {
            result = false;
        }

        return result;
    }
} 