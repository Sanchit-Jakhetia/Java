class Adder {
	static int add(int a, int b) {
		return a + b;
	}
	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
class OverloadTest {
	public static void main(String arg[]) {
		System.out.println(Adder.add(45,56));
		System.out.println(Adder.add(84,65,26));
	}
}