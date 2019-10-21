public class Wilder //creation de la Classe
{
    String firstName;
    boolean aware;

    //Création du constructeur
    public Wilder(String name, boolean aware) 
    {
        this.firstName = name;
        this.aware = aware;
    }

    public Wilder(String name)
    {
        this.firstName = name;
        this.aware = true;
    }

    // permet d'acceder à la valeur de name
    public  String getName() 
    {
        return this.firstName;
    }

    //permet d'acceder à la valeur de aware
    public  boolean getAware() 
    {
        return this.aware;
    }

    //permet de modifier la valeur de name
    public void setName(String firstname) 
    {
        this.firstName = firstname;
    }

    //permet de modifier la valeur de aware
    public void setAware(Boolean aware) 
    {
        this.aware = aware;
    }

    //methode pour retourner un texte
    public String whoAmI()
    {
        String name = getName();
        boolean aware = getAware();
         if (getAware())
         {
         return ("Je m'appelle "+ this.getName()+ " et je suis aware");
         }
         else
         {
         return ("Je m'appelle "+ this.getName() + " et je ne suis pas aware");
         }
    }

}

