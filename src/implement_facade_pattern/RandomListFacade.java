package implement_facade_pattern;

import java.util.List;

public class RandomListFacade {
    public void printRandomEvenList(int size, int min, int max){
        RandomList randomList = new RandomList();
        ListFilter listFilter = new ListFilter();
        List<Integer> list = listFilter.filterOdd(randomList.generateList(size, min, max));
        ListPrinter listPrinter = new ListPrinter();
        listPrinter.printList(list);
    }
}
