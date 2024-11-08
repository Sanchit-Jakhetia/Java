import java.io.*;

class Simple1 {

    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("ABC.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}