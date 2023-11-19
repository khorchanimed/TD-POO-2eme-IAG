package exercice1;

public class Point {
	
	String nom ; 
	double x , y ;
	
	public Point(String nom, double x, double y) {
		
		this.nom = nom;
		this.x = x;
		this.y = y;
	}

	public Point() {
		nom ="O" ; 
		x= 0 ; 
		y =0 ; 
	} 
	
	public void afficher()
	{
		System.out.println(nom + "(" + x +","+y +")");
		
	}
	

}
