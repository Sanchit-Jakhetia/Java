class Thread1 extends Thread {
public void run() {
	System.out.println("This is first thread");
	try {
		Thread.sleep(2000);
	} catch(Exception e){}
	}
}
class Thread2 extends Thread {
	public void run() {
		System.out.println("This is Second thread");
		try {
			Thread.sleep(2000);
		} catch(Exception e){}
	}
}
class Thread3 extends Thread {
	public void run() {
		System.out.println("This is Third thread");
	}
}
class FristThread1 {
	public static void main(String args[]) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
		t2.start();
		t3.start();
	}
}