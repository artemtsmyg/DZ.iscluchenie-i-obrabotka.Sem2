package org.example.Zadacha2;

/**
 * Если необходимо, исправьте данный код (задание 2)
 * Задание 2
 * try {
 *    int d = 0;
 *    double catchedRes1 = intArray[8] / d;
 *    System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *    System.out.println("Catching exception: " + e);
 * }
 */

public class zadacha2 {

        public static void main(String[] args) {
                try {
                        int d = 3; // Изменено значение d на не ноль
                        double catchedRes1 = 0; // Инициализируем переменную заранее
                        catchedRes1 = 8 / d; // Убрано условие if, теперь происходит деление
                        System.out.println("catchedRes1 = " + catchedRes1);
                } catch (ArithmeticException e) {
                        System.out.println("Catching exception: " + e);
                }
        }
}

