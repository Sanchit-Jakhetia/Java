interface A {
	public void getName(String s);
}

class MethodReference {
	public static void getInfo(String info) {
		System.out.println(info);
	}
	
	public static void main(String args[]) {
		A a=(String s) -> System.out.println(s);
		a.getName("Sanchit");
		
		A a1=MethodReference::getInfo;
		a1.getName("Jakhetia");
	}
}