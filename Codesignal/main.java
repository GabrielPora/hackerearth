package Codesignal;

// Columnar ZigZag and Reverse Traversal of Matrices
class Solution {
    public static int[] columnTraverse(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        String direction = "up";
        int row = rows - 1;
        int col = cols - 1;
        int[] output = new int[rows * cols];
        int index = 0;

        while (index < rows * cols) {
            output[index++] = matrix[row][col];

            if (direction.equals("up")) {
                if (row - 1 < 0) {
                    direction = "down";
                    col -= 1;
                } else {
                    row -= 1;
                }
            } else {
                if (row + 1 == rows) {
                    direction = "up";
                    col -= 1;
                } else {
                    row += 1;
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int[] result = columnTraverse(matrix);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class Solution2 {
    public static void printMatrixTraversal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int col = cols - 1; col >= 0; --col) {
            if (col % 2 != 0) {
                for (int row = rows - 1; row >= 0; --row) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else {
                for (int row = 0; row < rows; ++row) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        printMatrixTraversal(matrix);
    }
}