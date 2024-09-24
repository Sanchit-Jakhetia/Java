import java.util.Scanner;
public class FirstTwoCharCopies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int n = str.length();
        String firstTwoChars = str.length() >= 2 ? str.substring(0, 2) : str;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(firstTwoChars);
        }
        System.out.println("Result: " + result);
    }
}
