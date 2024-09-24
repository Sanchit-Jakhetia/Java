class A {
	int a,b;
	A(int a,int b) {
		this.a=a;
		this.b=b;
	}
}
class B extends A {
	int a,b,c;
	B(int a, int b, int c) {
		super(a,b);
		this.c=c;
	}
	void disp() {
		System.out.println("The value of a is: "+super.a);
		System.out.println("The value of b is: "+super.b);
		System.out.println("The value of c is: "+c);
	}
}
class Super {
	public static void main(String arg[]) {
		B obj = new B(42,45,50);
		obj.disp();
	}
}