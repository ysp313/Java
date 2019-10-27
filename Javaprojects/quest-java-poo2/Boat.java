public class Boat extends Vehicule
{
    public Boat()
    {
        super(brand, kilometers);
    }
    @Override
    public String doStuff()
    {
        return "Je suis "+ this.getBrand()+ " et je fais glou glou!";
    }

}