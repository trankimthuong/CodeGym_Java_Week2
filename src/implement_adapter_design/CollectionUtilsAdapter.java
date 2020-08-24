package implement_adapter_design;

import com.codegym.CollectionUtils;

import java.util.*;

public class CollectionUtilsAdapter implements CollectionOperations {
    @Override
    public int findMax(Set<Integer> numbers) {
        CollectionUtils collectionUtils = new CollectionUtils();
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        System.out.println(list);
        return collectionUtils.findMax(list);
    }
}
