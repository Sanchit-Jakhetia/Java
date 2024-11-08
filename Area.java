import java.util.Scanner;
public class Area{
    public double calArea(double l, double b) {
        return l * b;
    }
	
    public double calArea(double r) {
        return 3.14*r*r;
    }
	
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Area obj = new Area();
		
		System.out.print("Length: ");
		Double l = in.nextDouble();
		System.out.print("Breadth: ");
		Double b = in.nextDouble();
        System.out.println("Area of Rectangle: " + obj.calArea(l, b));

		System.out.print("Radius: ");
		Double r = in.nextDouble();
        System.out.println("Area of Circle: " + obj.calArea(r));
    }
}
