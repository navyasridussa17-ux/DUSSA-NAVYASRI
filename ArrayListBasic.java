import java.util.ArrayList;
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Guava");
        System.out.println("Initial ArrayList: "+ fruits);

        String first = fruits.get(0);
        System.out.println("First element: "+ first);

        fruits.set(1, "Orange");
        System.out.println("After set(1, \"Orange\"): " + fruits);
        fruits.remove(2);
        System.out.println("After remove(2): " + fruits);

    }
}
