class Assert3 
{
   public static void main(String[] args) 
  {
       int x = 5;
       assert x == 7 : "x should be 7";
       //here should be AssertionError
       System.out.println(x);
   }
}