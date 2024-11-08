import java.util.StringTokenizer;
public class StringTokenizer1 {
  public static void main(String args[]) {
    String str = "Welcome to String Tokenizer";
	StringTokenizer st = new StringTokenizer(str);
	System.out.println("Tokens after splitting: ");
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}