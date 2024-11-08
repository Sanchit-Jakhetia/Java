import java.util.*;
public class StringTokenizer3 {
	public static void main(String args[]){
	String str ="niet.co.in";
	StringTokenizer strTokens = new StringTokenizer(str, ".");
	int c=strTokens.countTokens();
	System.out.println("Number of tokens: "+c);
	}
}