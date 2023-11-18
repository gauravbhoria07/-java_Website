 class MatrixMultiplicationThread extends Thread {
    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] result;
    private int row;

    public MatrixMultiplicationThread(int[][] matrixA, int[][] matrixB, int[][] result, int row) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.result = result;
        this.row = row;
    }

    public void run() {
        for (int col = 0; col < matrixB[0].length; col++) {
            result[row][col] = 0;
            for (int i = 0; i < matrixA[0].length; i++) {
                result[row][col] += matrixA[row][i] * matrixB[i][col];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};
        int[][] result = new int[matrixA.length][matrixB[0].length];

        MatrixMultiplicationThread[][] threads = new MatrixMultiplicationThread[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                threads[i][j] = new MatrixMultiplicationThread(matrixA, matrixB, result, i);
                threads[i][j].start();
            }
        }

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                try {
                    threads[i][j].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Display the result matrix
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
