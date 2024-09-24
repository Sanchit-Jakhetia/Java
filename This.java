class This1
{
   This1()
    {
        System.out.println("default");
    }
 
    This1(int x)
    {
        this();
        System.out.println(x);
    }
 
    This1(int x, int y)
    { 
        this(5);
        System.out.println(x * y);
    }
 
 public static void main(String args[])
    {
        new This1(8, 10);
    }
}