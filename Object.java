class A {
	void display() {
		System.out.println("Display Method");
	}
	
	void display1() {
		System.out.println("Display1 Method");
	}
}

class Object {
	public static void main(String arg[]) {
		A obj = new A();
		obj.display();
		obj.display1();
	}
}