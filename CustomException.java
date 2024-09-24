class InvalidAgeException extends Exception
{
 	InvalidAgeException(String s)
	{
         super(s);
 	}
}

  class CustomException
 {

   	static void validate(int age)throws InvalidAgeException
	{
     	if(age<18)
      	throw new InvalidAgeException("not valid");
     	else
      	System.out.println("welcome to vote");
   	}
   
   	
	public static void main(String args[])
	{
      		try
		{
      		validate(19);
      		}
		catch(Exception e){System.out.println("Exception occured:"+e);}
	
		finally
		{
		System.out.println("Exception was handled");
		}
      	System.out.println("rest of the code...");
  	}
 }