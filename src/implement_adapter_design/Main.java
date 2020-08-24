package implement_adapter_design;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CollectionOperations collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(1);
        set.add(14);
        set.add(11);
        set.add(19);
        set.add(15);
        System.out.println("Set: ");
        System.out.println(set);
        client.printMaxValue(set);
    }
}
