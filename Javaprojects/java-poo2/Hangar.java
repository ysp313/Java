public class Hangar
{
    public static void  main(String[] args)
    {
        //création des instances
        Car citroen = new Car("c3", 25000);
        Boat acean = new Boat("sealer", 456675);

        //utilisation de la méthode
        System.out.println(citroen.doStuff());
        System.out.println(acean.doStuff());

    }
}