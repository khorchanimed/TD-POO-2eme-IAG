package exercice4;


public class Personne {
	
	private int id ; 
        private String nom , prenom ; 
	private Date dateNaiss ;
	
	
	public Personne(int id,String nom, String prenom, Date dateNaiss) {
		this.id=id
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
	} 
	
	public int calculAge(int anneeA) {
		
		return anneeA - dateNaiss.getAnnee() ; 
	}
	
	
	public void afficher() {
		
		System.out.println("[" + id +" : "+ nom + " "+ prenom +" " + dateNaiss.toString() + "]"); 
	} 

	public int getId() {
		return id
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	
}
