import java.util.Scanner;

public class EE41 {

	public static String capitalize(String phrase) {
		String[] mots=phrase.split(" ");
		for(int i=0;i<mots.length;i++) {
			String premierCaractere=mots[i].substring(0, 1);
			String resteDuMot=mots[i].substring(1, mots[i].length());
			mots[i]=premierCaractere.toUpperCase()+resteDuMot;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String phrase=scn.nextLine();
		scn.close();
	}
	
}
