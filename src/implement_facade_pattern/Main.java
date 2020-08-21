package implement_facade_pattern;

public class Main {
    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade();
        randomListFacade.printRandomEvenList(10, 1, 100);
    }
}
