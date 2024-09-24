class RunnableThread implements Runnable {
    Thread t1, t2;

    RunnableThread() {
        t1 = new Thread(this, "EvenThread");
        t2 = new Thread(this, "OddThread");
        t1.start();
        t2.start();
    }

    int e = 2, o = 1;

    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (Thread.currentThread() == t1) {
                System.out.println(e);
                e += 2;
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            } else {
                System.out.println(o);
                o += 2;
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
        }
    }
}

class RunnableThread1 {
    public static void main(String ar[]) {
        RunnableThread rt = new RunnableThread();
    }
}