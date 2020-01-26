public class Basket {

    public static void basket() {

        Account account = Account.getInstance();

        System.out.println("\nYour basket:");
        User user = account.getUser();
        for (Furniture furniture : user.getFurnitures()) {
            System.out.printf("%s: %d€%n", furniture.getName(), furniture.getPrice());
        }
    }
}
