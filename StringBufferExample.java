public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        sb.append(" World");  
        System.out.println("Appended String: " + sb.toString());
        sb.insert(5, " Java");  
        System.out.println("String after insertion: " + sb.toString());
        
        sb.replace(6, 10, "C++");  
        System.out.println("String after replacement: " + sb.toString());
        
        sb.reverse(); 
        System.out.println("Reversed String: " + sb.toString());
    }
}