public class Matrix {
    private int[][] matrix;

    Matrix(int row, int column) {
        matrix = new int[row][column];
        // all values are zeros
    }

    void set(int row, int column, int val) {
        matrix[row - 1][column - 1] = val;
    }

    Matrix transpose() {
        //This method returns a new created matrix object
        //Problem with trying to not make new object is that the 2d array size cannot be changed after initialized.
        Matrix matrixT = new Matrix(matrix[0].length,matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixT.set(j + 1,i + 1,matrix[i][j]);
            }
        }
        return matrixT;
    }


    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("|" + matrix[i][j] + "|");
            }
            System.out.println();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sb.append("|").append(matrix[i][j]).append("|");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


}
