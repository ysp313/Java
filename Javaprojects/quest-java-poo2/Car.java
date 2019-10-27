public class Car extends Vehicule
{
    public  Car(){
        super(brand);
        super(kilometers);
    }
    @Override
    public String doStuff()
    {
        return "Je suis "+this.getBrand()+ " et je fais vroum vroum!";
    }
}