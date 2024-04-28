import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class E10 {
    public static void main(String[] args) {
        ArrayList<String> listWith = new ArrayList<>();
        listWith.add("Papaya");
        listWith.add("Banana");
        listWith.add("Papaya");
        listWith.add("Banana");
        listWith.add("Orange");
        listWith.add("Mango");


        Set<String> set = new LinkedHashSet<>(listWith);
        ArrayList<String> listWithout = new ArrayList<>(set);

        System.out.println("List after removing duplicates: " + listWithout);
    }
}