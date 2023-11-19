package exercice4;

import java.util.Scanner;

public class ParfaitsInf1000 {

	public static void main(String[] args) {

	    
	    
	    int N , i ,som ; 
	    
	    
	    
	    for(N=1 ;N<1000;N++)
	    {
	    
	    som = 0 ; 
	    for(i=1 ; i<=N/2 ; i++)
	    	if(N%i == 0)
	    		som = som+i ; 
	    
	    if(N == som)
	    	 System.out.print(N + " | ");
	    }
	
}
	

}
