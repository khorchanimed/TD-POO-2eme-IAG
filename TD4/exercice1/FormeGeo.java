package exercice1;

public abstract class FormeGeo {

	protected String couleur ;

	public FormeGeo(String couleur) {
	
		this.couleur = couleur;
	}

	
	public String toString() {
		return "couleur=" + couleur  ;
	} 
	
	public abstract double calculSurface() ;
	
}
