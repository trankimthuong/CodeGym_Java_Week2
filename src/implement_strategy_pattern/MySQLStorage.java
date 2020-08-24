package implement_strategy_pattern;

public class MySQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println(user);
        System.out.println("MySQL storage");
    }
}
