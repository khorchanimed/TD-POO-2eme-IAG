package exercice1;

public class Point {

	private String nom;
	private double x, y;

	public Point(String nom, double x, double y) {

		this.nom = nom;
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return nom + "(" + x + "," + y + ")";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
