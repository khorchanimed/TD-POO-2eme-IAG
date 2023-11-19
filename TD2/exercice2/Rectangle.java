package exercice2;

public class Rectangle {
	
	private double longueur ; 
	private double largeur ;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	} 
	
	
	public void afficher() {
		System.out.println("Longueur = " + longueur + " et largeur = " + largeur);
	}
	
	public double surface() {
		return longueur * largeur ; 
	}
	

}
