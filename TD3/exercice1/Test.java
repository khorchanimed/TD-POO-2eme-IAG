package exercice1;

public class Test {

	public static void main(String[] args) {

		Point p1, p2, p3;

		p1 = new Point("A", 2, 95);
		p2 = new Point("B", 12, 15);

		Segment AB = new Segment(p1, p2);

		AB.afficher();

		System.out.println("Longueur = " + AB.calculerLongueur());

		if (AB.estHorizontal())
			System.out.println("Le segment est Horizontal");
		else if (AB.estVertical())
			System.out.println("Le segment est Vertical");
		else
			System.out.println("Le segment est incliné");

		
		p3 = new Point("C", 2, 5);
		if (AB.appartient(p3))
			System.out.println("Le point 'C' appartient au segment ");
		else
			System.out.println("Le point 'C' n'appartient pas au segment ");

	}

}
