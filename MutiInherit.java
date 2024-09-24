class Car
{
   Car() {
	System.out.println("This is Car Class");
   }
   void vehicleType() {
	System.out.println("The Vehicle Type is Car");
    }
	void speed() {
		System.out.println("Max speed is 100Kmph");
	}
}
class Maruti extends Car
{
   Maruti()
   {
	System.out.println("This is Maruti Class");
   }
    void brand()
   {
	System.out.println("This is Maruti Brand");
   }
   void speed()
   {
	super.speed();
	System.out.println("Max speed is 90Kmph");
   }
}

 class Maruti800 extends Maruti
{

   Maruti800()
   {
	System.out.println("This is Maruti800 Model:");
   }
    void speed()
   {
	super.speed();
	System.out.println("Max speed is 80Kmph");
   }

   public static void main(String args[])
   {
	 Maruti800 obj=new Maruti800();
	 obj.vehicleType();
	 obj.brand();
	 obj.speed();
   }
}