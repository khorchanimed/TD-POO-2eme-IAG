package exercice5;

import java.util.Scanner;

public class Parfaits {

	public static void main(String[] args) {

	   
	    
	    int N , i ,som , nb = 0 ; 
	    
	    System.out.println("Les quatre premiers nombres parfaits sont :  ");
	    
	    N=1 ; 
	    do {
	    
	    som = 0 ; 
	    for(i=1 ; i<=N/2 ; i++)
	    	if(N%i == 0)
	    		som = som+i ; 
	    
	    if(N == som) {
	    	 nb++ ; 
	    	 System.out.print(N + " | ");
	    	 }
	    N++ ; 
	    }
	    while(nb!=4);
	    	
	
}

	}


