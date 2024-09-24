public class EqualsVsDoubleEquals {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        if (str1 == str2) {
            System.out.println("Using == : Strings are the same");
        } else {
            System.out.println("Using == : Strings are different");
        }
        if (str1.equals(str2)) {
            System.out.println("Using .equals() : Strings are the same");
        } else {
            System.out.println("Using .equals() : Strings are different");
        }
    }
}
