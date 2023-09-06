package HW1;

public class HW_1_part {
    public static boolean checkArray(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Массив пуст или null.");
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != columns) {
                System.out.println("Строка " + i + " имеет разную длину (" + matrix[i].length + "), от остальных строк.");
                return false;
            }
        }

        System.out.println("Все строки и столбцы имеют одинаковую длину: " + rows + "x" + columns);
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8}
        };

        if (checkArray(matrix1)) {
            System.out.println("Матрица 1 корректна.");
        } else {
            System.out.println("Матрица 1 некорректна.");
        }

        if (checkArray(matrix2)) {
            System.out.println("Матрица 2 корректна.");
        } else {
            System.out.println("Матрица 2 некорректна.");
        }
    }
}

