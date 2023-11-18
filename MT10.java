class NamedPriorityThread extends Thread {
    public NamedPriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println("Thread: " + getName() + ", Priority: " + getPriority());
    }
}

 class ThreadNamePriorityExample {
    public static void main(String[] args) {
        NamedPriorityThread thread1 = new NamedPriorityThread("ThreadA", Thread.MIN_PRIORITY);
        NamedPriorityThread thread2 = new NamedPriorityThread("ThreadB", Thread.NORM_PRIORITY);
        NamedPriorityThread thread3 = new NamedPriorityThread("ThreadC", Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
