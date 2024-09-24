class FibonacciSeries {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int x = 0, y = 1;
		System.out.print("The series is: ");
		System.out.print(x + " " + y);
		for (int z = 2; z < a; z++) {
			int c = x + y;
			System.out.print(" " + c);
			x = y;
			y = c;
		}
	}
}
