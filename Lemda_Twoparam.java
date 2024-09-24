interface Add {
	int sum(int x, int y);
}

public class Lemda_Twoparam {
	public static void main(String arg[]) {
		
		//Lambda expression without return keyword
		Add a=(x,y) -> (x+y);
		System.out.println("The sum of two numbers is "+a.sum(45,55));
		
		//Lambda expression with return keyword
		Add a1=(int x,int y) -> {
			return (x+y);
		};
		System.out.println("The sum of two numbers is "+a1.sum(175,195));
	}
}