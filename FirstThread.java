class Thread1 extends Thread {
	public void run() {
		System.out.println("This is First Thread");
	}
}
class Thread2 extends Thread {
	public void run() {
		System.out.println("This is Second Thread");
	}
}
class Thread3 extends Thread {
	public void run() {
		System.out.println("This is Third Thread");
	}
}
class FirstThread {
	public static void main(String arg[]) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
		t2.start();
		t3.start();
	}
}
