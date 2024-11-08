class Instance {
    int i;
	//int i=23;
	String str;
    void disp1() {
        System.out.println("The variable is " + str);
    }

    public static void main(String ar[]) {
        Instance i = new Instance();
        i.disp1();
    }
}