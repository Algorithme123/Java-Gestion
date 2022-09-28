package Correction;

public class Compte {
	private int numCompte ;
	private double montant ;
	
	
	public Compte(double solde, int numCompte) {
		this.montant =solde ;
		this.numCompte = numCompte ;
	}


	public int getNumCompte() {
		return numCompte;
	}


	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}

	
	
}

