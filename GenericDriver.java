import java.util.Scanner; 
class Car   
{  
String model;  
 
Car(String model)   
{  
    this.model = model;  
}  

public void startEngine()   
{  
    System.out.println("Engine started for " + model);  
}  
}  
public class GenericDriver   
{  
public static void main(String[] args)   
{  
     
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter the car model: ");  
    String model = sc.nextLine();  
    sc.close();  
     
    Car myCar = new Car(model);  
     
    myCar.startEngine();  
}  
}