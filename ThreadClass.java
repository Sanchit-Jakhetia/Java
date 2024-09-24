class EvenThread extends Thread {
    int e;

    EvenThread() {
        e = 2;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(e);
            e += 2;

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class OddThread extends Thread {
    int o;

    OddThread() {
        o = 1;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(o);
            o += 2;

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class ThreadClass {
	public static void main(String ar[]) {
		EvenThread et=new EvenThread();
		OddThread ot=new OddThread();
		et.start();
		ot.start();
	}
}