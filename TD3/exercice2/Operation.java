package exercice2;

public class Operation {

	private String typeOp;
	private int montant;
	private Date dateOp;

	public Operation(String typeOp, int montant, Date dateOp) {
		this.typeOp = typeOp;
		this.montant = montant;
		this.dateOp = dateOp;
	}

	public String toString() {
		return "[" + typeOp + " , " + montant + " DT , " + dateOp.toString() + "]";
	}

	public String getTypeOp() {
		return typeOp;
	}

	public void setTypeOp(String typeOp) {
		this.typeOp = typeOp;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public Date getDateOp() {
		return dateOp;
	}

	public void setDateOp(Date dateOp) {
		this.dateOp = dateOp;
	}

}
