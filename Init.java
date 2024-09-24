class Init {
	{
		System.out.println("init block");
	}
	Init() {
		System.out.println("default");
	}
	Init(int x) {
		System.out.println(x);
	}
	public static void main(String[] args) {
		new Init();
		new Init(10);
	}
}