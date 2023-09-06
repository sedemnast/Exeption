/*Задание 4*/

package HW2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            if (userInput.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя.");
            }
            System.out.println("Вы ввели: " + userInput);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        return scanner.nextLine();
    }
}
