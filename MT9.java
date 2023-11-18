class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class.");
    }
}

 class ThreadExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
