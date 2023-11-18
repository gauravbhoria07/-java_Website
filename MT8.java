class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface.");
    }
}

 class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
    }
}
