interface i {
	void d1();
	void d2();
}
class Inter implements i {
	public void d1() {
		System.out.println("This is the interface first method");
	}
	public void d2() {
		System.out.println("This is the interface second method");
	}
	public static void main(String[] args) {
		Inter i = new Inter();
		i.d1();
		i.d2();
	}
}