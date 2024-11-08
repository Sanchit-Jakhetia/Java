import java.io.*;

class FileRead1 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("A.java");
        FileOutputStream fos = new FileOutputStream("M.java");

        int i = 0;
        while ((i = fis.read()) != -1) {
            fos.write((byte)i);
			System.out.print((byte)i);
        }

        fis.close();
        fos.close();
    }
}