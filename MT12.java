class SharedResource {
    private boolean flag = false;

    public synchronized void printOdd(int number) {
        while (flag) {
            try {
                wait(); // Wait for even to be printed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Odd: " + number);
        flag = true;

        notify(); // Notify even to print
    }

    public synchronized void printEven(int number) {
        while (!flag) {
            try {
                wait(); // Wait for odd to be printed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Even: " + number);
        flag = false;

        notify(); // Notify odd to print
    }
}

class OddThread extends Thread {
    private SharedResource sharedResource;
    private int max;

    public OddThread(SharedResource sharedResource, int max) {
        this.sharedResource = sharedResource;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 1; i <= max; i += 2) {
            sharedResource.printOdd(i);
        }
    }
}

class EvenThread extends Thread {
    private SharedResource sharedResource;
    private int max;

    public EvenThread(SharedResource sharedResource, int max) {
        this.sharedResource = sharedResource;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 2; i <= max; i += 2) {
            sharedResource.printEven(i);
        }
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        int max = 10;

        Thread oddThread = new OddThread(sharedResource, max);
        Thread evenThread = new EvenThread(sharedResource, max);

        oddThread.start();
        evenThread.start();
    }
}
