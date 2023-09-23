package org.example.Zadacha3;

/**
 * Дан следующий код, исправьте его там, где требуется (задание 3)
 * Задание 3
 *
 * public static void main(String[] args) throws Exception {
 *    try {
 *        int a = 90;
 *        int b = 3;
 *        System.out.println(a / b);
 *        printSum(23, 234);
 *        int[] abc = { 1, 2 };
 *        abc[3] = 9;
 *    } catch (Throwable ex) {
 *        System.out.println("Что-то пошло не так...");
 *    } catch (NullPointerException ex) {
 *        System.out.println("Указатель не может указывать на null!");
 *    } catch (IndexOutOfBoundsException ex) {
 *        System.out.println("Массив выходит за пределы своего размера!");
 *    }
 * }
 * public static void printSum(Integer a, Integer b) throws FileNotFoundException {
 *    System.out.println(a + b);
 * }
 */

public class zadanie3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            // Здесь выход за пределы массива, исправим это
            abc[2] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка деления на ноль!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        // В этом методе нет необработанных исключений, поэтому уберем throws FileNotFoundException
        System.out.println(a + b);
    }
}
