class Animal {
    void sound() {
        System.out.println("Animal");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat");
    }
}
class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        a.sound();
        d.sound();
        c.sound();
    }
}
