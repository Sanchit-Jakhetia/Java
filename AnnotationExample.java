import java.util.ArrayList;
public class AnnotationExample {

    @Deprecated
    public void oldMethod() {
        System.out.println("This is a deprecated method.");
    }

    @SuppressWarnings("unchecked")
    public void methodWithWarning() {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        System.out.println("List content: " + list);
    }

    @Override
    public String toString() {
        return "AnnotationExample class";
    }

    public static void main(String[] args) {
        AnnotationExample example = new AnnotationExample();

        example.oldMethod();
        example.methodWithWarning();
        System.out.println(example.toString());
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array content:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
