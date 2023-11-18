 class SumPrimeThread extends Thread {
    private int limit;
    private long sum;

    public SumPrimeThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 20;
        SumPrimeThread sumPrimeThread = new SumPrimeThread(limit);
        sumPrimeThread.start();

        try {
            sumPrimeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of prime numbers up to " + limit + ": " + sumPrimeThread.sum);
    }
}
