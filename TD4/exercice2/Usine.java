package exercice2;

import java.util.Vector;

public class Usine {

	private String nom;
	private String adresse;

	private Vector<Robot> robots;

	public Usine(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
		this.robots = new Vector<Robot>();
	}

	public void ajouterRobot(Robot r) {
		robots.add(r);
	}

	public int calculConsEnergie() {
		int e = 0;

		for (int i = 0; i < robots.size(); i++)
			e += robots.get(i).calculEnergie();

		return e;
	}

	public void avancerRobots() {
		for (int i = 0; i < robots.size(); i++)
			if (robots.get(i) instanceof RobotMobile)
				((RobotMobile) robots.get(i)).avancer();

	}
	public void tournerRobots() {
		for (int i = 0; i < robots.size(); i++)
			if (robots.get(i) instanceof RobotMobile)
				((RobotMobile) robots.get(i)).tourner();

	}
	
	public void afficher()
	{
		for (int i = 0; i < robots.size(); i++)
			System.out.println(robots.get(i).toString());
	}

}
