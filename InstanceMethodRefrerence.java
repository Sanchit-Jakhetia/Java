interface A {
	public void add(int x,int y);
}

class addi {
	public static void sum(int a, int b) {
		System.out.println("The sum is :"+(a+b));
	}
}

class InstanceMethodRefrerence {
	public static void main(String arg[]) {
		A a1=(a,b) -> System.out.println("The sum is:"+(a+b));
		a1.add(30,24);
		A a2=addi::sum;
		a2.add(300,240);
	}
}
		