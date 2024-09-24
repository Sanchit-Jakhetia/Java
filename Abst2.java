abstract class A {
    abstract void disp1();
}

abstract class B extends A {
    abstract void disp2();
}

class C extends B {
    void disp1() {
        System.out.println("This is A class abstract method");
    }
	void disp2() {
    System.out.println("This is B class abstract method");
}
}
class abst1 {
    public static void main(String ar[]) {
        C obj = new C();
        obj.disp1();
        obj.disp2();
    }
}