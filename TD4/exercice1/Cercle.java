package exercice1;

public class Cercle extends FormeGeo implements Deplaçable {

	private Point centre;
	private double rayon;

	public Cercle(String couleur, Point centre, double rayon) {
		super(couleur);
		this.centre = centre;
		this.rayon = rayon;
	}

	public void deplacer(double dx, double dy) {
		centre.setX(centre.getX() + dx);
		centre.setY(centre.getY() + dy);

	}

	public double calculSurface() {

		return Math.PI * Math.pow(rayon, 2);
	}

	public String toString() {
		return super.toString() + " , centre =" + centre.toString() + ", rayon=" + rayon;
	}

}
