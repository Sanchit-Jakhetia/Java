import java.util.*;

public class Locale11 {

    public static void main(String[] args) {

        // create a new array and get all installed locales
        Locale[] locales = Locale.getAvailableLocales();

        // print locales
        System.out.println("Installed locales are:");

        for (int i = 0; i < locales.length; i++) {
            System.out.println(i + ":" + locales[i]);
        }
    }

}