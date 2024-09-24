class Factorial {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = 1;
        for (int c = 1; c <= a; c++) {
            b =b * c;
        }
        System.out.println("Factorial is: "+b);
    }
}
