class  CandyCount {
	public static void main(String[] args) 
	{
		double argent = 12.4;
		double prix = 1.2;
		int nbBonbons = 0;
		if ((argent > 0) && (prix > 0))
		{
			while ((argent - prix) >=  0)
			{ 
				nbBonbons += 1;
				argent =  argent -  prix;
			}
		}
		// afficher nb bonbons
	   	System.out.println(nbBonbons);
	}
}
