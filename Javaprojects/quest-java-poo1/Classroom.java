public class Classroom
{
    public static void main(String[] args) 
    {
        // la référence Jean-Claude reçoit une nouvelle instance de la classe Duck
        Wilder jeanClaude = new Wilder("Jean-Claude", true); 
        // utilisation de la methode whoAmI     
        System.out.println(jeanClaude.whoAmI());

        // la référence Henri reçoit une nouvelle instance de la classe Duck
        Wilder henri = new Wilder("Henri", false); 
        // utilisation de la methode whoAmI     
        System.out.println(henri.whoAmI());
    }
}