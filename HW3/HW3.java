package HW3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в формате: Фамилия Имя Отчество дд.мм.гггг НомерТелефона Пол");

            String input = scanner.nextLine();
            String[] data = input.split(" ");

            if (data.length != 6) {
                throw new IllegalArgumentException("Неверное количество данных. Введите данные в правильном формате.");
            }

            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String birthDateStr = data[3];
            String phoneNumberStr = data[4];
            String genderStr = data[5];

            Date birthDate = parseDate(birthDateStr);
            long phoneNumber = parsePhoneNumber(phoneNumberStr);
            char gender = parseGender(genderStr);

            String fileName = lastName + ".txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                String userData = String.format("%s %s %s %tD %d %c%n", lastName, firstName, middleName, birthDate, phoneNumber, gender);
                writer.write(userData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IllegalArgumentException | ParseException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static Date parseDate(String dateStr) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        return dateFormat.parse(dateStr);
    }

    private static long parsePhoneNumber(String phoneNumberStr) throws NumberFormatException {
        try {
            return Long.parseLong(phoneNumberStr);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат номера телефона.");
        }
    }

    private static char parseGender(String genderStr) throws IllegalArgumentException {
        if (genderStr.length() != 1 || (!genderStr.equals("Ж") && !genderStr.equals("М"))) {
            throw new IllegalArgumentException("Неверный формат пола. Используйте 'Ж' или 'М'.");
        }
        return genderStr.charAt(0);
    }
}
