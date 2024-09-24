class const1 {
	int a,b;
	const1(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("The value of a is: " +a);
		System.out.println("The value of b is: " +b);
	}
}

class Constructor
{
	public static void main(String arg[]) {
		const1 c = new const1(10,20);
	}
}
