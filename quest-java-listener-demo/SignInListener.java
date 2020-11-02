public interface SignInListener {

    /**
     * the sign process is in progress
     */
    void onLoading();

    /**
     * @param user returns the connected user
     */
    void onSuccess(User user);

    /**
     * @param error returns the error message
     */
    void onError(String error);
}