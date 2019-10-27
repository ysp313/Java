public class Dog extends Animal implements Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Munch munch");
    }

    @Override
    public void play() {
        System.out.println("Woof!");
    }

    @Override
    public boolean pet() {
        System.out.println("Yap!");
        return true;
    }
}
