import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter text (type 'exit' to stop):");
		
        try(FileOutputStream fos = new FileOutputStream("output.txt")) {
            String s;
            while (!(s = in.nextLine()).equalsIgnoreCase("exit")) {
                fos.write(s.getBytes());
                fos.write(System.lineSeparator().getBytes());
            }
            System.out.println("Text saved to: output.txt");
        } catch (IOException e) {
            System.out.println("Error occurred while writing to file.");
        }
    }
}
