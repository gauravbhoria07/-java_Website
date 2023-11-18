import java.util.Arrays;

 class ParallelSortThread extends Thread {
    private int[] array;

    public ParallelSortThread(int[] array) {
        this.array = array;
    }

    public void run() {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 8, 4, 7, 2, 6};
        ParallelSortThread sortThread = new ParallelSortThread(numbers);
        sortThread.start();

        try {
            sortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
