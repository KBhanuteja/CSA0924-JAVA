public class MatrixAddition {
    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{5, 6}, {7, 8}};

        int[][] resultMatrix = addMatrices(firstMatrix, secondMatrix);

        // Displaying the result matrix
        System.out.println("The resulting matrix is: ");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] resultMatrix = new int[firstMatrix.length][firstMatrix[0].length];

        // Checking if matrices can be added
        if (firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length) {
            System.out.println("Matrices cannot be added due to dimension mismatch.");
            return null;
        }

        // Adding the matrices
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[0].length; j++) {
                resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        return resultMatrix;
    }
}