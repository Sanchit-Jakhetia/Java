import java.util.Scanner;
class InvalidAge extends Exception {
    public InvalidAge(String s) {
        super(s);
    }
}
public class CustomExc {
    static void checkAge(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("Age less. Not allowed.");
        } else {
            System.out.println("Granted");
        }
    }
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Age: ");
		int age=in.nextInt();
        try {
            checkAge(age);
        } catch (InvalidAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
