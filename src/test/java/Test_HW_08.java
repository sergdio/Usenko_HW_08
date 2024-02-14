
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_HW_08 {

    // Метод для генерації матриці 3x3 з усіма елементами, що дорівнюють 2
    private int[][] generateMatrix() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = 2;
            }
        }
        return matrix;
    }

    // Метод для обчислення суми елементів у рядку матриці
    private int calculateRowSum(int[] row) {
        int sum = 0;
        for (int num : row) {
            sum += num;
        }
        return sum;
    }

    @Test
    public void testMatrixElements() {
        int[][] matrix = generateMatrix();

        // Виведемо матрицю на екран
        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Перевірка суми елементів в кожному рядку
        for (int i = 0; i < 3; i++) {
            int expectedSum = 6; // Очікувана сума для кожного рядка (2+2+2=6)
            int actualSum = calculateRowSum(matrix[i]);

            // Виведемо на екран суму для кожного рядка
            System.out.println("Row " + (i + 1) + " sum: " + actualSum);

            // Порівняння фактичної суми з очікуваною використовуючи Assert
            Assert.assertEquals(actualSum, expectedSum, "Sum of elements in Row " + (i + 1) + " is incorrect");
        }
    }
}