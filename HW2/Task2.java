/* Задание 2*/

package HW2;

public class Task2 {

    public static void main(String[] args) {
        try {
            int[] intArray = new int[5]; // Пример массива
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
