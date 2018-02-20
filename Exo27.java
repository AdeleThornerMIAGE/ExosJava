import java.util.Scanner;

public class Exo27 {
	
	
	public static double moyenne(int[] notes) {
		double m=0;
		for(int i=0;i<notes.length;i++) {
			m+=notes[i];
		}
		m=m/notes.length;
		return m;
	}
	
	public static void main (String[] args) {
		Scanner scn=new Scanner(System.in);
		String name=scn.nextLine();
		int[] notes=new int[3];
		notes[0]=Integer.parseInt(scn.nextLine());
		notes[1]=Integer.parseInt(scn.nextLine());
		notes[2]=Integer.parseInt(scn.nextLine());
		scn.close();
		System.out.println(name + " : average="+moyenne(notes));
	}

}
