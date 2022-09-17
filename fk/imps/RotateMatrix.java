public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int length = matrix.length;

        // Both below combined rotates the matrix in clockwise direction

        // reverse the rows first row last, last row first
        for (int i = 0; i < length / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[length - i - 1];
            matrix[length - i - 1] = temp;
        }

        // Logic to convert rows to column
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int[] is : matrix) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();

        }

    }

}
