public class ThrowExample {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Welcome to voting.");
        }
	}
    public static void main(String[] args) {
        try {
            validateAge(16); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Program continues after throw and catch.");
    }
}
