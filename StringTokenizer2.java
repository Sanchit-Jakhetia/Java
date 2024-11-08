import java.util.*;
public class StringTokenizer2{
  public static void main(String args[]){
    //string with multiple delimiters slash, dot, comma
    String str = "hi/hello,bye.goodbye";

    //passing multiple delimiters
    StringTokenizer strTokens = new StringTokenizer(str, "/,.");
    while(strTokens.hasMoreElements()){
      System.out.println(strTokens.nextToken());
    }
  }
}