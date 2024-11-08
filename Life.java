class MyThread extends Thread {
    public void run() {
        for (int i = 1; i < 9; i++) {
            System.out.println(i);
			try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
public class Life {
    public static void main(String[] args) {
		int c=0;
        MyThread t = new MyThread();
        System.out.println("Thread state: " + t.getState());
        t.start();
        System.out.println("Thread after start: " + t.getState());
        while (t.isAlive()) {
			if(c==1)
				System.out.println("Thread state: " + t.getState());
			try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
			c++;
        }
        System.out.println("Thread after completion: " + t.getState());
    }
}
