class A {
    A() {
        System.out.println("Constructor of A");
    }
    void methodA() {
        System.out.println("Super class method A");
    }
}

class B extends A {
    void methodB() {
		System.out.println("Sub class Method B");
	}
}
class C extends A {
    void methodC() {
        System.out.println("Sub class Method C");
    }

    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        obj1.methodA();
        obj2.methodB();
        obj3.methodC();
    }
}