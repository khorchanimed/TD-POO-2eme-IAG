package exercice1;

public class Rectangle extends FormeGeo {

	private double longueur, largeur;

	public Rectangle(String couleur, double longueur, double largeur) {
		super(couleur);
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public String toString() {
		return super.toString() + ", longueur=" + longueur + ", largeur=" + largeur;
	}

	public double calculSurface() {

		return longueur * largeur;
	}

}
