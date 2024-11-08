class Box<T> {

    private T contents;

    public Box(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return this.contents;
    }
}

class GenericMethod2 {

    public static void main(String[] args) {

        Box<Integer> intCont = new Box<>(42);
        System.out.println("Method Returned: " + intCont.getContents());

        Box<String> stringCont = new Box<>("Hello Generic Method");
        System.out.println("Method Returned: " + stringCont.getContents());
    }
}

