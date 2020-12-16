import java.util.Random;

public class Cat extends Animal implements Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Chomp chomp");
    }

    @Override
    public void play() {
        System.out.println("Meow!");
    }

    @Override
    public boolean pet() {
        Random random = new Random();
        boolean agrees = random.nextBoolean();
        if (agrees) {
            System.out.println("Purr purr");
        } else {
            System.out.println("...");
        }
        return agrees;
    }

    @Override
    public void trick() {
        System.out.println("Nope.");
    }
}
