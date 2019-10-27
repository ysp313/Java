public interface Fly
{
    void takeOff(); //takeOff sans argument, qui ne retourne rien.

    int ascend(int meters); //ascend qui prend un entier meters, qui retourne un entier.

    int descend(int meters); //descend qui prend un entier meters, qui retourne un entier.

    void land();//land sans argument, qui ne retourne rien.

    default void glide()
    {
        System.out.println("It glides into the air."); //glide, sans argument, qui ne retourne rien et qui possède un comportement par défaut : afficher le texte "It glides into the air."
    }

}