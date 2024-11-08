//Creating annotation  
import java.lang.annotation.*;  
import java.lang.reflect.*;  
 
@Retention(RetentionPolicy.RUNTIME)  
@interface MyAnnotation
{  
int value();  
}  
  
//Applying annotation  
class Hello
{  
@MyAnnotation(value=120)  
public void sayHello(){System.out.println("Hello This is My Annotation");}  
}  
  
//Accessing annotation  
class CustomAnnotation1
{  
public static void main(String args[])throws Exception{  
  
Hello h=new Hello();  
Method m=h.getClass().getMethod("sayHello");  
  
MyAnnotation mant=m.getAnnotation(MyAnnotation.class);  
System.out.println("The value is: "+mant.value());  
}}