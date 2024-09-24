class MyException extends Exception
{
	MyException(String msg)
	{
	super(msg);
	}
}

 class CustomException1
 {
	public static void main(String ar[])
	{
	int a=1000,b=5;
	  	
		try
	  	{
		float c=(float)b/a;
		if(c<0.1)
		throw new MyException("Number is too much small");
		}
		
		catch(MyException me)
		{
		System.out.println(me.getMessage());
		}
		
		finally
		{
		System.out.println("Exception was caught");
		}
	}
 }