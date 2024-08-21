package app;

import java.util.Scanner;

public class Main {


    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("  Квадрат числа " + number + " дорівнює " + square + ".");
    }


    public static double calculateCylinderVolume(double radius, double height) {

        return Math.PI * radius * radius * height;
    }


    public static int calculateSum(int[] numbers) {
        int sum = 0;


        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }


    public static String reverseString(String input) {

        StringBuilder stringBuilder = new StringBuilder(input);


        stringBuilder.reverse();


        return stringBuilder.toString();
    }


    public static double power(int a, int b) {

        return Math.pow(a, b);
    }


    public static void printTextMultipleTimes(int n, String text) {

        if (n <= 0) {
            System.out.println("Кількість повторень повинна бути більше нуля.");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("1. Введіть ціле число: ");
        int inputNumber = scanner.nextInt();
        scanner.nextLine();
        printSquare(inputNumber);


        double radius = 3.5;
        double height = 10.0;


        double volume = calculateCylinderVolume(radius, height);


        System.out.println();
        System.out.println("2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");


        int[] numbers = {10, 20, 30, 40, 50};
        int sum = calculateSum(numbers);


        System.out.println();
        System.out.print("3. Масив чисел: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("  Сума всіх елементів масиву дорівнює " + sum + ".");


        System.out.println();


        System.out.print("4. Введіть рядок: ");
        String originalString = scanner.nextLine();
        String reversedString = reverseString(originalString);


        System.out.println("  Рядок в зворотньому порядку: " + reversedString);

        System.out.println();
        System.out.print("5. Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("  Введіть b: ");
        int b = scanner.nextInt();
        double result = power(a, b);


        System.out.println("  Результат " + a + "^" + b + " дорівнює " + (int) result + ".");


        System.out.println();


        System.out.print("6. Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("  Введіть текстовий рядок: ");
        String text = scanner.nextLine();


        printTextMultipleTimes(n, text);

        scanner.close();
    }
}
