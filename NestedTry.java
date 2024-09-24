class NestedTry {
 	public static void main(String args[]) {
 	 	try {
			int ar[]={23,34,56};
			ar[3]=26;
    		try {
     			int b =39/0;
				System.out.println("going to divide");
    		} catch(ArithmeticException e) {
				System.out.println(e);
			}
 
			try {
				int a[]=new int[5];
    			a[5]=4;
   		 	} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}	
  		} catch(Exception e) {
		System.out.println("Array Index Error");
		}
		finally{System.out.println("Exception Was Aways Handled");}

  	System.out.println("normal flow of Program");
 	}
 }