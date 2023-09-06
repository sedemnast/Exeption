/* Задание 1.
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.*/

package HW2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели: " + userInput);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введите дробное число (float): ");
                result = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите корректное дробное число.");
                scanner.nextLine(); // Очистка буфера ввода
            }
        }

        return result;
    }
}
