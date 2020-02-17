public interface TransactionListener {

    /**  
     * the sign process is in progress
     */
    void onLoading();  

    /**  
     * @param user returns the connected user  
     */
    void onSuccess(Bank bank);  

    /**  
     * @param error returns the error message  
     */
    void onError(String error);  
}
