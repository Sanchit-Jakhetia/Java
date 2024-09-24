class Teacher 
{
   String designation = "Teacher";
   String collegeName = "NIET";

   	void does()
	{
	System.out.println("The work of teacher is"+" "+ "Teaching");
   	}
}

 class WebTechTeacher extends Teacher
{
void does()
	{	
         
	System.out.println("The work of teacher is"+" "+ "WebTech Teaching");
        super.does();
   	}
   String mainSubject = "Web Technologies";
   	public static void main(String args[])
	{
	WebTechTeacher  obj;//Reference
	obj = new WebTechTeacher();//Object
	System.out.println("The College Name is"+" "+ obj.collegeName);
	System.out.println("The Designation is"+" "+ obj.designation);
	System.out.println("The Main Subject is"+" "+obj.mainSubject);
        obj.does();

   }
}