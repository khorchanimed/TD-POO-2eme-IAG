package exercice2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
Rectangle R1 = new Rectangle(20,10) ; 

Scanner scan = new Scanner(System.in);

System.out.println("Donner Longueur : ");
double L = scan.nextDouble() ; 


System.out.println("Donner Largeur : ");
double l = scan.nextDouble() ; 

Rectangle R2 = new Rectangle(L,l) ; 

R1.afficher(); 
R2.afficher();

System.out.println("La surface de R1 est : "+ R1.surface());
		
R1.setLargeur(13);
R1.afficher();	
		

}

}
