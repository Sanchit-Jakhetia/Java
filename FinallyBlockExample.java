public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
            System.out.println("This line will not be executed.");
        } catch (ArithmeticException e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block is always executed, whether an exception is caught or not.");
        }
        System.out.println("Program continues");
    }
}