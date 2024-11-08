import java.io.*;

class Simple {

    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("ABC.txt");
            fw.write("my name is sanchit");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("success");
    }
}