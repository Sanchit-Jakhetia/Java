import java.io.*;
public class InputArray1 
{

public static void main(String[] args)throws IOException 
{
	InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    System.out.println("enter number of elements");

    int n=Integer.parseInt(br.readLine());

    int arr[]=new int[n];

    System.out.println("enter elements");

    for(int i=0;i<n;i++)
	{
	//for reading array
        arr[i]=Integer.parseInt(br.readLine());

    	}
System.out.println("The inputed elements are");
	//for(int i: arr)
	for(int i=0;i<arr.length;i++)
    
	{ 
        System.out.println(arr[i]);

    	}


	}
	}