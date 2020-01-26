public class Shopping {

    public static void shop() {

        Account account = Account.getInstance();
        User user = account.getUser();

        Furniture chair = new Furniture("ODJER", 79);
        user.getFurnitures().add(chair);

        Furniture table = new Furniture("EKEDALEN", 129);
        user.getFurnitures().add(table);
    }
}
