package exercice3;

import java.util.Scanner;

public class Parfait {

	public static void main(String[] args) {

		
		    Scanner scan = new Scanner(System.in) ; 
		    
		    int N , i ,som ; 
		    
		    System.out.print("Donner un entier : ");
		    N = scan.nextInt() ; 
		    
		    som = 0 ; 
		    for(i=1 ; i<=N/2 ; i++)
		    	if(N%i == 0)
		    		som = som+i ; 
		    
		    if(N == som)
		    	 System.out.print(N + " est Parfait");
		    else
		    	 System.out.print(N + " n'est pas Parfait: ");
		    	
		
	}

}
