abstract class A {
	abstract void show();
	void show1() {
		System.out.println("This is non-abstract method of abstract class");
	}
}
class B extends A {
	void show() {
		System.out.println("This is abstract method implementation of abstract class");		
	}
}
class abst {
	public static void main(String[] args) {
		B obj = new B();
		obj.show(); //abstract method
		obj.show1(); //non-abstract method
	}
}