// Morozov A.D. = 30 % 12 = 6
package Tasks;
import java.util.Random;

public class Fourth {
    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        int[][] matrix = new int[rows][cols];
        int[] minIndices = new int[cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for (int j = 0; j < cols; j++) {
            int minIndex = 0;
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] < matrix[minIndex][j]) {
                    minIndex = i;
                }
            }
            minIndices[j] = minIndex;
        }

        System.out.println();
        
        for (int index : minIndices) {
            System.out.print(index + " ");
        }
    }
}
