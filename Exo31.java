
public class Exo31 extends Exo27 {

	public static void main(String[] args) {
		int nb_rolls=0;
		int d1,d2;
		do {
			d1= (int)(Math.random()*6)+1;
			d2= (int)(Math.random()*6)+1;
			nb_rolls++;
		}
		while(d1!=1 || d2!=1);
		System.out.println(nb_rolls);
	}
}
