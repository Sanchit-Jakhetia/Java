interface A {
	void disp1();
}
interface B {
	void disp2();
}
interface C extends A,B {
	class Multi implements C {
		public void disp1() {
			System.out.println("This is disp1");
		}
		public void disp2() {
			System.out.println("This is disp2");
		}
		public void disp3() {
			System.out.println("This is disp3");
		}
		public static void main(String arg[]) {
			Multi m = new Multi();
			m.disp1();
			m.disp2();
			m.disp3();
		}
	}
}
		