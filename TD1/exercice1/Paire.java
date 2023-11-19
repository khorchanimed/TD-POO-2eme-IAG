package exercice1;

import java.util.Scanner;

public class Paire {

	public static void main(String[] args) {

      int N ; 
      
      Scanner sc = new Scanner(System.in) ; 
      
      System.out.print("Donner un entier : ");
      N = sc.nextInt() ; 
      
      if(N%2 ==0)
    	  System.out.println(N+" est pair");
      else
    	  System.out.println(N+" est impair");
    	  
    	  
		
		

	}

}
