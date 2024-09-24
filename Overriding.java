class A {
	int sum(int a, int b) {
	return a+b;
	}
}
class B extends A {
	int sum(int a, int b) {
		System.out.println(super.sum(400,200));
		return a*b;
	}
}
class C extends B {
	int sum(int a, int b) {
		System.out.println(super.sum(40,20));
		return a/b;
	}
}
class Overriding {
	public static void main(String arg[])
	{
		C obj = new C();
		System.out.println(obj.sum(40,20));
	}
}