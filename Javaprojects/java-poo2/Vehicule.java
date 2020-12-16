public abstract class Vehicule
{
    protected String brand;
    protected int kilometers;

    public Vehicule(String brand, int kilometers)
    {
        this.brand = brand;
        this.kilometers = 0;
    }

    //Getters
    public String getBrand()
    {
        return this.brand;
    }

    public int getKilometers()
    {
        return this.kilometers;
    }

    //Setters
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setKilometers(int kilometers)
    {
        this.kilometers = kilometers;
    }

    //Methode
    public abstract String doStuff();

}