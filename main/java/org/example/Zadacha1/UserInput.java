package org.example.Zadacha1;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Метод для запроса у пользователя ввода дробного числа (типа float).
 *
 * @return Введенное пользователем дробное число.
 */
public class UserInput {
    public static float getUserFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float userInput = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введите дробное число (float): ");
                userInput = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введенное значение не является дробным числом. Попробуйте снова.");
                scanner.nextLine(); // Очищаем буфер ввода
            }
        }

        return userInput;
    }

    /**
     * Основной метод, который использует `getUserFloatInput`
     * для считывания значения float от пользователя и его печати.
     * @param args
     */
    public static void main(String[] args) {
        float userFloat = getUserFloatInput();
        System.out.println("Вы ввели: " + userFloat);
    }
}