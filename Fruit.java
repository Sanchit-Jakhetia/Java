import java.util.ArrayList;
public class Fruit {
    public static void main(String[] args) {
     ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana"); 
        fruits.add("Mango");
        System.out.println("Fruit names are :");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        if (!fruits.isEmpty()) {
            System.out.println("Last fruit name is : " + fruits.get(fruits.size() - 1));
        }
        System.out.println("Size of ArrayList: " + fruits.size());
        fruits.clear();
        System.out.println("All fruits removed. Size of ArrayList after clear: " + fruits.size());
    }
}
