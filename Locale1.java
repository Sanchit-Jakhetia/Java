import java.util.Locale;
 import java.text.NumberFormat;

class Locale1 
{
    static public void main(String[] args) 
	{
        Locale locales[] = NumberFormat.getAvailableLocales();
        for (Locale l : locales) {
            System.out.println(l.toString());
	System.out.println(l.getDisplayName ());
        }
     
    }
}