import java.util.*;

class GenericsExample1 {
    public static void main(String args[]) {
        ArrayList<String> dataList = new ArrayList<String>();

        dataList.add("Meena");
        dataList.add("Reena");
        dataList.add("Rahul");
        dataList.add("Sohan");
        dataList.add("Aditya");

        // dataList.add(32); // compile time error

        // accessing element from dataList
        String s = dataList.get(1); // no need of type casting

        // printing an element of the list
        System.out.println("The Element is: " + s);

        // for iterating over the dataList elements
        Iterator<String> itr = dataList.iterator();

        // iterating and printing the elements of the list
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}