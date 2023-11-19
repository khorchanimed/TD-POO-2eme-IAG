package exercice4;

public class Test {

	public static void main(String[] args) {

 Personne p1 = new Personne (100,"TOUNSI" , "Ali" , new Date(1,5,2000)) ; 
 
 
 p1.afficher();
		
 System.out.println("Age = " + p1.calculAge(2023));
		

 p1.getDateNaiss().setAnnee(2001);
 
  p1.afficher();
	}

}
