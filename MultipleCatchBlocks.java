public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }
        
        System.out.println("Program continues after handling exceptions.");
    }
}
