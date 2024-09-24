import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }
}