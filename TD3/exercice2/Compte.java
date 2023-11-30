package exercice2;

import java.time.LocalDate;
import java.util.Vector;

public class Compte {

	private int numCompte;
	private int solde;
	private Personne titulaire;
	private Vector<Operation> operations;
	private static int cmp = 1;

	public Compte(Personne titulaire) {
		this.numCompte = cmp++;
		this.titulaire = titulaire;
		operations = new Vector<Operation>();

	}

	// Version 1
	public void deposer1(int somme) {
		solde += somme;
		operations.add(new Operation("Dépôt", somme, new Date(1, 2, 2023)));
	}

	// Version 2
	public void deposer2(int somme, Date dateOperation) {
		solde += somme;
		operations.add(new Operation("Dépôt", somme, dateOperation));
	}

	// Version 3
	public void deposer3(int somme) {

		solde += somme;
		LocalDate d = LocalDate.now(); // date système
		operations.add(new Operation("Dépôt", somme, new Date(d.getDayOfMonth(), d.getMonthValue(), d.getYear())));
	}

	// Version 1
	public void retirer1(int somme) {
		solde -= somme;
		operations.add(new Operation("Retrait", somme, new Date(1, 12, 2023)));
	}

	// Version 2
	public void retirer2(int somme, Date dateOperation) {

		solde -= somme;
		operations.add(new Operation("Retrait", somme, dateOperation));
	}

	// Version 3
	public void retirer3(int somme) {

		solde -= somme;
		LocalDate d = LocalDate.now();
		operations.add(new Operation("Retrait", somme, new Date(d.getDayOfMonth(), d.getMonthValue(), d.getYear())));
	}

	public void afficher() {
		System.out.println("[ Compte N° : " + numCompte + " ]");
		System.out.println("[ Titulaire du compte  : " + titulaire.toString() + " ]");
		System.out.println("[ Solde : " + solde + " DT ]");
		System.out.println("------ Les opérations---------");


		for (int i = 0; i < operations.size(); i++)
			System.out.println(operations.get(i).toString());

		
		/*
		 * for(Operation o : operations) System.out.println(o.toString());
		 */
		System.out.println("------------------------------");
	}

}
