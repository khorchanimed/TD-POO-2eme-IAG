package exercice1;

public class Test {

	public static void main(String[] args) {

		FormeGeo[] fg = new FormeGeo[3];

		fg[0] = new Rectangle("Rouge", 10, 7);
		fg[1] = new Cercle("Blanc", new Point("A", 8, 8), 4);
		fg[2] = new Rectangle("Noir", 5, 2);

		for (int i = 0; i < 3; i++)
			System.out.println(fg[i].toString() + " , Surface = " + fg[i].calculSurface());

		((Cercle) fg[1]).deplacer(5, 5);

		System.out.println(fg[1].toString());

	}

}
