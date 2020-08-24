package implement_strategy_pattern;

public class UserController {
    UserStorage userStorage;
    User user;
    public UserController(UserStorage userStorage, User user){
        this.userStorage = userStorage;
        this.user = user;
    }
    public void store(){
        userStorage.store(user);
    }
}
