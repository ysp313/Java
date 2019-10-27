public class Home {

    public static void main(String[] args) {
        Dog doggo = new Dog("Norbert", 4);
        System.out.printf("\n%s:%n", doggo.getName());
        doggo.feed();
        doggo.play();
        doggo.pet();
        doggo.pet();
        doggo.trick();

        Cat nyan = new Cat("Maru", 8);
        System.out.printf("\n%s:%n", nyan.getName());
        nyan.feed();
        nyan.play();
        nyan.pet();
        nyan.pet();
        nyan.pet();
        nyan.trick();
    }
}
