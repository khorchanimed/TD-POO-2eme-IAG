package exercice2;

public class RobotFixe extends Robot {
	
	private int nbAxes ; 
	private int portee ;
	
	public RobotFixe(String reference, int chargeMax, int nbAxes, int portee) {
		super(reference, chargeMax);
		this.nbAxes = nbAxes;
		this.portee = portee;
	}

	
	public String toString() {
		return  super.toString() + ", nbAxes=" + nbAxes + ", portee=" + portee ;
	}


	
	public int calculEnergie() {

		return chargeMax * nbAxes * portee;
	} 
	
	
	

}
