class PrintNumbersThread extends Thread {
    private int start;
    private int end;

    public PrintNumbersThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            // Use yield to give up the CPU for other threads
            Thread.yield();
        }
    }
}

public class ThreadControlExample {
    public static void main(String[] args) {
        PrintNumbersThread thread1 = new PrintNumbersThread(1, 5);
        PrintNumbersThread thread2 = new PrintNumbersThread(6, 10);

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Use join to wait for threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread completes.");
    }
}
