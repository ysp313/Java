public interface Pet {

    /**
     * feed the animal
     */
    void feed();

    /**
     * play with the animal
     */
    void play();

    /**
     * pet the animal
     * @return is animal happy
     */
    boolean pet();

    default void trick() {
        System.out.println("Does a trick.");
    }
}
