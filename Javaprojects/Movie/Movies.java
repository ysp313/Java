class  Movies {
	public static void main(String[] args) 
	{
        String[] titles = {
            "The last crusade", // Case [0]
            "Le temple maudit", // Case [1]
            "l'arche d'alliance" // Case [2]
        };
        
        String[][] acteurs = {
            { "Ford", // Case [0][0]
              "Connery", // Case [0][1]
              "Doody" // Case [0][2]
            }, // Case [0]
            {"Ford","Capshaw","Quan"}, // Case 1
            {"Ford","Allen","Freeman"} // Case 2
        };
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Dans le film "+ titles[i]+ ", les principaux acteurs sont : "+ acteurs[i][0]+ ", "+ acteurs[i][1]+ ", "+ acteurs[i][2]);
        }
	}
}