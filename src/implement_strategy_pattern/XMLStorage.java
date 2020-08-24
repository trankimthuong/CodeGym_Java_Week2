package implement_strategy_pattern;

public class XMLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println(user);
        System.out.println("xml storage");
    }
}
