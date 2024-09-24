class Base {
    String name;
    Base() {
        System.out.println("Default constructor Base");
    }
    Base(String name) {
        this.name = name;
        System.out.println("Calling Base parameterized constructor");
    }
}

class Derived extends Base {
	Derived() {
		System.out.println("Default constructor Derived");
	}
	Derived (String name) {
		super(name);
		System.out.println("Calling derived Parameterized constructor");
	}
}
class Super2 {
	public static void main(String[] args) {
		Derived obj1 = new Derived("test");
	}
}