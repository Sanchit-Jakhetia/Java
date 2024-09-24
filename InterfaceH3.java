class OuterClass {
    interface InnerInterface {
        void show();
    }
}
class ImplementClass implements OuterClass.InnerInterface {
    public void show() {
        System.out.println("Nested interface inside class");
    }
    public static void main(String[] args) {
        ImplementClass obj = new ImplementClass();
        obj.show();
    }
}
