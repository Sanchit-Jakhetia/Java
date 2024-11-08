class Outer {

    static int i = 50;

    static class Inner {
       void display() {
       System.out.println("The value of i is :" + i);
       }
    }
}
class StaticNestedClass
{

    public static void main(String args[]) {
       Outer.Inner obj = new Outer.Inner();
       obj.display();
    }
}