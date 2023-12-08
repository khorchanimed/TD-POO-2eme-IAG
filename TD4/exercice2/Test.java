package exercice2;

public class Test {

	public static void main(String[] args) {

     Usine u = new Usine("SmartTek", "Gabes") ; 
     
     u.ajouterRobot(new RobotFixe("Ro1", 100, 3, 20));
     u.ajouterRobot(new RobotMobile("Ro2",50,"Nord",new Position(4,5))); 
     
     
	System.out.println("Consommation Energie : " +u.calculConsEnergie());
		
	u.avancerRobots();
	u.tournerRobots();
	
	
    u.afficher(); 
		
		

	}

}
