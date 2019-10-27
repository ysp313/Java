import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();


        // TODO 2 : Add those heroes to the list
        Hero blackWidow = new Hero("Black Widows", 34); //0
        heroes.add(blackWidow); //0
        Hero captain = new Hero("Captain America", 100);
        heroes.add(captain); //1
        Hero vision = new Hero("Vision", 3);
        heroes.add(vision); //2
        Hero ironMan = new Hero("Iron Man", 48);
        heroes.add(ironMan); //3
        Hero scarlet = new Hero("Scarlet Witch", 29);
        heroes.add(scarlet); //4
        Hero thor = new Hero("Thor", 1500);
        heroes.add(thor); //5
        Hero spiderMan = new Hero("Spider Man", 18);
        heroes.add(spiderMan); //6
        Hero hulk = new Hero("Hulk", 49);
        heroes.add(hulk); //7
        Hero strange = new Hero("Doctor Strange", 42);
        heroes.add(strange); //8

        for (Hero hero : heroes) { // iterate though the list
            System.out.println(hero.getName()+ hero.getAge());
        }

        System.out.println(" ");
        System.out.println("##############Happy birthday################");
        System.out.println(" ");

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);
        // or "heroes.set(5, Thor, 1501);"
        for (Hero hero : heroes) { // iterate though the list
            System.out.println(hero.getName()+" "+ hero.getAge());
        }

        System.out.println(" ");
        System.out.println("##############Shuffle###############");
        System.out.println(" ");

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        for (Hero hero : heroes) { // iterate though the list
            System.out.println(hero.getName()+" "+ hero.getAge());
        }

        System.out.println(" ");
        System.out.println("##############Supprime###############");
        System.out.println(" ");


        // TODO 5 : Keep only the half of the list
        for (int i = 0; i <= heroes.size()+1/2; i++)
        {
            heroes.remove(i);
        }

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : heroes) { // iterate though the list
            System.out.println(hero.getName()+" "+ hero.getAge());
        }
    }
}