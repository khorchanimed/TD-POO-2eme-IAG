package exercice2;

public abstract class Robot {

	protected String reference ; 
	protected int chargeMax ;
	
	public Robot(String reference, int chargeMax) {
		this.reference = reference;
		this.chargeMax = chargeMax;
	}

	
	public String toString() {
		return "reference=" + reference + ", chargeMax=" + chargeMax ;
	} 
	
	public abstract int calculEnergie() ; 
	
	
}
