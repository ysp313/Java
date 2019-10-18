/*
 * Classe Decipherer 
 * Permet de décrypter les messages
 */

class  Decipherer 
{
	
	public static String decode(String message) 
	{
		int length = message.length();
		int keyNumber = length / 2;
		String resultat = message.substring(5, 5 + keyNumber);
		String replace1 = resultat.replace("@", " ");
		String replace2 = replace1.replace("#", " ");
		String replace3 = replace2.replace("?", " ");
		String finish = new StringBuffer(replace3).reverse().toString();
		return finish;
	}
	public static void main(String[] args) 
	{
		String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
		String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
		String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

		String decrypt1 = decode(message1);
		String decrypt2 = decode(message2);
		String decrypt3 = decode(message3);
		System.out.println(decrypt1+" "+decrypt2+" "+decrypt3);
	}
}
