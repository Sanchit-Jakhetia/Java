class GarbageCollectionDemo {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }
    public static void main(String[] args) {
        GarbageCollectionDemo a = new GarbageCollectionDemo();
        GarbageCollectionDemo b = new GarbageCollectionDemo();
        a = null;
        b = null;
        System.gc();
    }
}
