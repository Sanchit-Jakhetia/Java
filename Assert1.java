import java.util.Scanner;

class Assert1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur age ");

        int age = sc.nextInt();
        assert age >= 18 : "Not valid";

        System.out.println("Age is " + age);
    }

}