public class Main {

    public static void main(String[] args) {

        Account.signIn("Cartman", new SignInListener() {
            @Override
            public void onLoading() {
                System.out.println("Please wait...");
            }

            @Override
            public void onSuccess(User user) {
                System.out.printf("Welcome %s%n", user.getName());
            }

            @Override
            public void onError(String error) {
                System.out.printf("Sign in error : %s%n", error);
            }
        });
    }
}
