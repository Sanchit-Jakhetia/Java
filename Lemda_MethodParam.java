import java.util.*;

class Lemda_MethodParam 
{
    public static void main(String[] args) 
{
        // create an ArrayList
        ArrayList<String> langs = new ArrayList<>();

        // add elements to the ArrayList
        langs.add("java");
        langs.add("c");
        langs.add("python");
		langs.add("smaltalk");
		langs.add("basic");
		langs.add("pascal");
        System.out.println("ArrayList: " + langs);

        // pass lambda expression as parameter to replaceAll() method
        langs.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + langs);
    }
}