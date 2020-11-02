import java.util.Timer;
import java.util.TimerTask;

public class Account {

    public static void signIn(String name, SignInListener event) {
        // loading begins
        event.onLoading();

        if (name == null || name.isEmpty()) {
            // sends the error message and stops
            event.onError("Name is null or empty");
            return;
        }

        int time = (int) (Math.random() * ((4000 - 1000) + 1)) + 1000;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                User user = new User(name);
                // sends the user
                event.onSuccess(user);
            }
        }, time);
    }
}
