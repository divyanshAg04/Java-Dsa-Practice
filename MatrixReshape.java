import java.util.Arrays;

public class MatrixReshape {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] reshaped = new int[r][c];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshaped[count / c][count % c] = mat[i][j];
                count++;
            }
        }

        return reshaped;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2},
            {3, 4}
        };

        int r = 1;
        int c = 4;

        int[][] result = matrixReshape(mat, r, c);

        System.out.println("Reshaped Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}