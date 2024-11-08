import java.util.Scanner;
public class CapitalLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("String: ");
        String s = in.nextLine();

        StringBuilder c = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>=65 && ch<=91) {
                c.append(ch);
            }
        }

        System.out.println("Capitals: " + c.toString());
        in.close();
    }
}
