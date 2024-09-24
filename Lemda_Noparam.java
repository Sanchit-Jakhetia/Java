@FunctionalInterface // It is optional
interface Shape{
	public void shape();
}
public class Lemda_Noparam {
	public static void main(String[] args) {
		int x=12;
		//with lambda 
		Shape s=()->{ 
			System.out.println("The Shape is "+x); 
		};
	s.shape();
	}
}