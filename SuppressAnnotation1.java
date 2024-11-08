import java.io.*;  
import java.lang.Object;   // dont use * or will show error  
import java.util.*;  
 class Add {  
    public static int addition(int a, int b) {  
     
        int res = a + b;  
        return res;  
    }  
    public static int addition(int... n) {  
        int res = 0;  
        for (int i : n) {  
            res += i;  
        }  
         
        return res;  
    }  
}  
 class SuppressAnnotation1
{  
     
    @SuppressWarnings("unchecked")  
    public static void main(String[] args) {  
         
        Add ob1 = new Add();  
          
        @SuppressWarnings("deprecation")  
        int res = Add.addition(160, 240);  
          
        System.out.println("The Result obtained by Addition is " + res);  
        @SuppressWarnings("rawtypes")  
          
        List l = new ArrayList();  
        // Entering custom input values into the ArrayList.  
        l.add(2);  
        l.add(4);
	l.add(6);
	l.add(8);
	l.add(10);
  
        for(Object obj:l)
        System.out.println("Values stored in the List : " + obj);  
    }  
}