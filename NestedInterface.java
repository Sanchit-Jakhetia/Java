interface Outer
{  
  void show();
  void show1();
  interface Inner
  {  
   void msg(); 
   void msg1(); 
  }  
}  
  class NestedInterface implements Outer.Inner
 {  
 public void msg(){System.out.println("Hello msg method Inner interface");}  
public void msg1(){System.out.println("Hello msg1 method Inner interface");}   
 public static void main(String args[])
  {  
  NestedInterface m = new NestedInterface(); 
  m.msg();
   m.msg1();
 }  
}