class Rectangle {
    private int w = 10, h = 10;

    public int getArea() {
        return w * h;
    }
}

class Triangle extends Rectangle {
    @Override // Annotation of an overriding method
    public int getArea() {
        return super.getArea() / 2;
    }
}
class OverrideAnnotation {
    public static void main(String arg[]) {
        Triangle t = new Triangle();
        System.out.println(t.getArea());
    }
}