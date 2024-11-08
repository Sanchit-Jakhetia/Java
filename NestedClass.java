class Outer
{
  public void display()
  {
    System.out.println("Inside Outer");
    Inner in=new Inner();
    in.show();
  }

  class Inner
  {
    public void show()
    {
      System.out.println("Inside inner");
    }
  }
}

class NestedClass
{
  public static void main(String[] args)
  {
    Outer ot = new Outer();
    ot.display();
  }
}