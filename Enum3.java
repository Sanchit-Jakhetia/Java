class Enum3 
{
enum meal 
{
BREAKFAST(5) , LUNCH(10) , SNACKS(15) , DINNER(200);

private int value;
private meal(int value) 
{
this.value=value;
}
}
public static void main(String args[]) 
{
	for(meal m: meal.values())
		System.out.println(m+" "+m.value);
}
}