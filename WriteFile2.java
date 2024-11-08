import java.io.*;

class WriteFile2 {

    public static void main(String args[]) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the string: ");
        String str = br.readLine();
        FileOutputStream fos = new FileOutputStream("ABC.java");
        byte[] b = str.getBytes();
        fos.write(b);
        fos.close();
        System.out.println("successfully write Data into file");
    }
}