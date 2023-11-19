package exercice6;

import java.util.Scanner;

public class Notes {

	public static void main(String[] args) {

     Scanner scan = new Scanner(System.in) ; 
     int N , i ; 
     float som , moy ,max ;
     
     do {
     System.out.print("Donner le nombre de notes : ");
     N = scan.nextInt() ;
     }
     while(N<=0) ; 
     
	float[] notes = new float[N] ; 
	
	for(i=0 ; i<N ; i++) 
	 {
		do {
	 System.out.print("Donner note N° "+ (i+1) + " : "  );
	 notes[i] = scan.nextFloat() ; 
		}
		while(notes[i]<0 || notes[i]>20);
	 }
	
	som = 0 ; 
	for(i=0 ; i<N ; i++) 
		som =som +  notes[i] ; // som += notes[i] ;  
	
	    moy= som / N ;
	    
	  max = notes[0] ;   
	for(i=1 ; i<N ; i++) 
		if(notes[i]>max)
			max=notes[i] ; 
		
	for(i=0 ; i<N ; i++) 
		System.out.print(notes[i] + " | ");
	
	System.out.println("\nLa moyenne de notes est : " + moy);
	
	System.out.println("La note maximale est : " + max);
	
	}
	

}
