class DeprecatedAnnotation {
   
   @Deprecated
   int num=10;
	
   final int MAX_NUM=10;
    
   
   @Deprecated
   public void myMsg(){
       System.out.println("This method is marked as deprecated");
   }
     
   public void myMsg2(String msg, String msg2){
       System.out.println(msg+msg2);
   }
    
   public static void main(String a[]){      
    	DeprecatedAnnotation  obj = new DeprecatedAnnotation ();
        obj.myMsg();
        System.out.println(obj.num);
   }
}