package exercice3;

public class Test {

	public static void main(String[] args) {

    Complexe z1 = new Complexe(3,2) ; 
    
    Complexe z2 = new Complexe(5) ; 
    
    z1.afficher();
    z2.afficher();
    
    (z1.plus(z2)).afficher();
		
	z2.setImg(4) ; 	
	z2.afficher();
	
	}

}
