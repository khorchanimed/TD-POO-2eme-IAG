package exercice2;

public class Personne {

	private String cin, nom, prenom;

	public Personne(String cin, String nom, String prenom) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String toString() {
		return "cin: " + cin + ", nom: " + nom + ", prenom: " + prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
