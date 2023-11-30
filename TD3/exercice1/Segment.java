package exercice1;

public class Segment {
	private Point point1, point2;

	public Segment(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}

	public double calculerLongueur() {

		return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
	}

	public boolean estVertical() {
		return point1.getX() == point2.getX();

	}

	public boolean estHorizontal() {

		return point1.getY() == point2.getY();
	}
	
	public boolean appartient (Point x) {
		Segment AX = new Segment(point1,x); 
		Segment XB = new Segment(x,point2); 
		return (AX.calculerLongueur() + XB.calculerLongueur())== calculerLongueur() ; 
	}
	public void afficher() {
		System.out.println(point1.getNom() + "("+ point1.getX() +","+point1.getY()+")|----------|"+point2.getNom() + "("+ point2.getX() +","+point2.getY()+")" );
		
	}
	
}
