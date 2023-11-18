 class EvenOddThread extends Thread {
    private int start;
    private int end;

    public EvenOddThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0 && Thread.currentThread().getName().equals("EvenThread")) {
                System.out.println("Even: " + i);
            } else if (i % 2 != 0 && Thread.currentThread().getName().equals("OddThread")) {
                System.out.println("Odd: " + i);
            }
        }
    }

    public static void main(String[] args) {
        EvenOddThread evenThread = new EvenOddThread(1, 20);
        EvenOddThread oddThread = new EvenOddThread(1, 20);

        evenThread.setName("EvenThread");
        oddThread.setName("OddThread");

        evenThread.start();
        oddThread.start();
    }
}
