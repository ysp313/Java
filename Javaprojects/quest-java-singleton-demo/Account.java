public class Account {

    // singleton declaration
    private static Account instance;

    public static Account getInstance() {
        if (instance == null) {
            // if no instance exists, create one
            instance = new Account();
        }
        // in any case, return the same instance
        return instance;
    }

    // private constructor to avoid new instances
    private Account() {}

    // infos stored into the singleton
    private User user;

    public void signIn(String name) {
        user = new User(name);
    }

    public User getUser() {
        return user;
    }
}
