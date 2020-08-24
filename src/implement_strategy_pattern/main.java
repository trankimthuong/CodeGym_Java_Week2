package implement_strategy_pattern;

public class main {
    public static void main(String[] args) {
        User user = new User("thuong dep trai", 69);
        UserController userController = new UserController(new XMLStorage(), user);
        userController.store();
    }
}
