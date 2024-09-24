interface Disp {
    public int show(int a);
}
class Lemda_Oneparam {
    public static void main(String[] args) {
		
        //with lambda
        Disp d = (int a) -> a;
        System.out.println("The result is " + d.show(45));
//****************************************************************
        //with return statement
        Disp d1 = (int a) -> {
            return a;
        };
        System.out.println("The result is " + d1.show(85));
    }
}