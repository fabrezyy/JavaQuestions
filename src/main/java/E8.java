import java.util.ArrayList;

public class E8 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Papaya");
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.removeIf(x -> !x.startsWith("A"));

        for (String fruit : fruits) {
            System.out.println(fruit.toLowerCase());
        }
    }
}
