import java.util.Timer;
import java.util.TimerTask;

public class Transactions {

    public static void withdraw(Bank account, int value,  TransactionListener event) {
        // Le loading démarre
        event.onLoading();

        if (account == null) {
            // Envoi du message et stop la procédure
            event.onError("Name is null or empty");
            return;
        }

        int time = (int) (Math.random() * ((1000 - 500) + 1)) + 500;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                account.setTotal(account.getTotal() - value);
                event.onSuccess(account);
            }
        }, time);
    }
}
