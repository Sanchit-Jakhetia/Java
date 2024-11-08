import java.util.Scanner;

public class AgeAssertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = in.nextInt();

        assert age >= 18 : "Not eligible to vote";

        System.out.println("Eligible to vote.");
        in.close();
    }
}
