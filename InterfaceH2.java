interface OuterInterface {
    interface NestedInterface {
        void display();
    }
}
class TestClass implements OuterInterface.NestedInterface {
    public void display() {
        System.out.println("Nested interface inside interface");
    }
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
    }
}
