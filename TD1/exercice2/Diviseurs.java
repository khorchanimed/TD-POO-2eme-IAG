package exercice2;

import java.util.Scanner;

public class Diviseurs {

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in) ; 
    
    int N , i ; 
    
    System.out.print("Donner un entier : ");
    N = scan.nextInt() ; 
    
    System.out.println("Les diviseurs de "+N + " sont : ");
    
    for(i=1 ; i<=N/2 ; i++)
    	if(N%i == 0)
    		System.out.print(i + " | ");
    
    System.out.print(N);
		

	}

}
