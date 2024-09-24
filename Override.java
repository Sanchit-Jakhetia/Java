class BaseClass 
 {
     BaseClass(){System.out.println ("Base Class Constructor");}
     void methodToOverride() 
     {
         System.out.println ("I'm the method of BaseClass");
     }
 }
class DerivedClass extends BaseClass 
{
DerivedClass(){System.out.println("Derived Class Constructor");}
 void methodToOverride() 
       {
	    super.methodToOverride(); 
            System.out.println ("I'm the method of DerivedClass"); 
       }
 }

class DerivedClass1 extends DerivedClass
 {
DerivedClass1(){System.out.println("Derived Class1 Constructor");}
       void methodToOverride() 
       {
	    super.methodToOverride(); 
            System.out.println ("I'm the method of DerivedClass1");
		
       }
 }
 class MethodOverriding 
 {
     public static void main (String args [])
      {
	 
          DerivedClass1 obj1 = new DerivedClass1();  
            
       	 obj1.methodToOverride();	
  }  }