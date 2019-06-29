public class Matrix {
    private int[][] matrix;
    private int row;
    private int column;

    Matrix(int row, int column) {
        matrix = new int[row][column];
        this.row = row;
        this.column = column;
        // all values are zeros
    }

    void set(int row, int column, int val) {
        matrix[row - 1][column - 1] = val;
    }

    private boolean checkSquare() {
        if (row == column) {
            return true;
        }
        return false;
    }

    public void transposeSquare() {
        if (checkSquare()) {
            for (int i = 0; i < row; i++) {
                // this must be j = i or else on the later loop the transposed row or column will be transposed again reverting it back to the original.
                for (int j = i; j < column; j++) {
                    int temporary = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temporary;
                }
            }
        } else {
            System.out.println("The selected matrix is not a square");
        }
    }

    Matrix transpose() {
        //This method returns a new created matrix object
        //Problem with trying to not make new object is that the 2d array size cannot be changed after initialized.
        Matrix matrixT = new Matrix(column,row);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixT.set(j + 1,i + 1,matrix[i][j]);
            }
        }
        return matrixT;
    }


    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("|" + matrix[i][j] + "|");
            }
            System.out.println();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sb.append("|").append(matrix[i][j]).append("|");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


}
