package Correction;

public class Client {
	private String nom,prenom,adresse ;
	private int numClient ;
	private Compte compte ;
	
	public Client(String n, String p, String add,int numClient,Compte compte) {
		this.nom = n;
		this.prenom =p ;
		this.adresse = add ;
		this.numClient = numClient ;
		this.compte =compte ;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNumClient() {
		return numClient;
	}

	public void setNumClient(int numClient) {
		this.numClient = numClient;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Client nom=" +getNom() + ", prenom=" + getPrenom() + ", adresse=" + getAdresse()+ ", numClient=" +getNumClient()
				+ " solde=" +getCompte().getMontant() ; 
	
	}

	

	
	
}
