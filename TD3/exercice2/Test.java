package exercice2;

public class Test {

	public static void main(String[] args) {

		Compte c1 = new Compte(new Personne("12345678", "TOUNSI", "Med Ali"));
		Compte c2 = new Compte(new Personne("987654321", "BEN SALH", "Mounir"));

		c1.deposer3(2000);
		c1.deposer2(450, new Date(23, 11, 2023));

		c1.retirer1(30);

		c1.afficher();
		c2.retirer3(400);
		c2.afficher();

	}

}
