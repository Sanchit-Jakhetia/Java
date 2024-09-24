interface A
{
void a();//bydefault, public and abstract
void b();
void c();
void d();

}

abstract class B implements A
{
public void c() 
 {
 System.out.println("I am C");
 }
public void d()
 {
 System.out.println("I am D");
 }

}
class M extends B
{
public void a(){System.out.println("I am A");}
public void b(){System.out.println("I am B");}

}
//Creating a test class that calls the methods of A interface

class interface_abstract
{
public static void main(String args[])
{
B obj = new M();
obj.a();
obj.b();
obj.c();
obj.d(); 
}
}