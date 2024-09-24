import java.util.Scanner;
public class MergeStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int len = Math.max(str1.length(), str2.length());
        
        for (int i = 0; i < len; i++) {
            if (i < str1.length()) {
                result.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                result.append(str2.charAt(i));
            }
        }
        System.out.println("Merged String: " + result);
    }
}
