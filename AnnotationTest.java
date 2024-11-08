class A {
    void m() {
        System.out.println("Hello m");
    }

    @Deprecated
    void n() {
        System.out.println("Hello n");
    }
}

class AnnotationTest {
    public static void main(String ar[]) {
        A a = new A();
		a.m();
        a.n();
    }
}