package org.example;

import java.util.Scanner;

/**
 * Программа, которая выбрасывает исключение при вводе пустой строки.
 */
public class EmptyStringExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите текст: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new IllegalArgumentException("Ошибка: Пустые строки вводить нельзя.");
            } else {
                System.out.println("Вы ввели: " + input);
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}