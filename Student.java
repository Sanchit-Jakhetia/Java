class Student {
    String name;
    int age;
    Student() {
        name = "abc";
        age = 0;
    }
    Student(String name) {
        this.name = name;
        age = 0;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("John");
        Student student3 = new Student("Alice", 20);
        student1.display();
        student2.display();
        student3.display();
    }
}
