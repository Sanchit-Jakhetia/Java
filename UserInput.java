import java.io.*;

class UserInput {

    public static void main(String ar[])throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter First Number: ");
        int a = Integer.parseInt(br.readLine());
		System.out.print("Enter Second Number: ");
        int b = Integer.parseInt(br.readLine());

        int c = a + b;

        System.out.println("The addition of two numbers is " + c);
    }
}