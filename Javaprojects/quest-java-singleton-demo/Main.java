public class Main {

    public static void main(String[] args) {

        // sign in
        Account account = Account.getInstance();
        account.signIn("Bobby");

        User user = account.getUser();
        System.out.printf("Hello %s!%n", user.getName());

        // shop some furnitures
        Shopping.shop();

        // show basket content
        Basket.basket();
    }
}
