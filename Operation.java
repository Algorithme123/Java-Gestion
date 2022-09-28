package Correction;

import java.util.*;

public class Operation {
	ArrayList<Client> liste = new ArrayList<> ();
	Scanner clavier = new Scanner(System.in);
	
	public void ajoutClient() {
		System.out.println("Nom du client :");
		String nom = clavier.next();
		
		System.out.println("prenom du client :");
		String prenom = clavier.next();
		
		System.out.println("Adresse du client :");
		String adresse = clavier.next();
		
		System.out.println("Numero du client :");
		int numClient = clavier.nextInt();
		
		int num =0;
		if(liste.isEmpty()) {
			num= 1;
		}else if(!liste.isEmpty()) {
			num = liste.size()+1;
		}
	 Compte c = new Compte(0d , num);
	 Client client = new Client(nom,prenom,adresse,numClient,c) ;
	 liste.add(client);
	 System.out.println("Client crée avec succès!!");
		}
		
		
	public void versement() {
		int index=0;
		System.out.println("Entrer le numero du client :");
		int num= clavier.nextInt();
		
		for(Client c:liste) {
			if(c.getNumClient()==num) {
				index=liste.indexOf(c);
				System.out.println("Saisir le montant :");
				double m= clavier.nextDouble();
				liste.get(index).getCompte().setMontant(
				liste.get(index).getCompte().getMontant()+m);
			}
		boolean isFind=false;
		if(!isFind) {
			System.out.println("Client non trouvé!!");
		}
		
	}
		
	
		}
	public void retrait () {
		int index=0;
		boolean isFind=false;
		System.out.println("Entrer le numero du client :");
		int num= clavier.nextInt();
		for(Client c:liste) {
			if(c.getNumClient()==num) {
				isFind= true;
				index = liste.indexOf(c);
				System.out.println("saisir le montant a retirer:");
				double montant= clavier.nextDouble();
				if(liste.get(index).getCompte().getMontant()>=montant) {
					liste.get(index).getCompte().setMontant(
							liste.get(index).getCompte().getMontant()-montant);
					System.out.println("Retrait effectué avec succes !!");
				}
				else 
					System.out.println("Solde insuffisant");
				
			}
			else 
				System.out.println("le client n'existe pas !");
		
			}
		   if (!isFind) {
			   System.out.println("pasde client crée !!");
		   }
		   	
	
	}
	public void afficherClient() {
		if(!liste.isEmpty()) {
			for(Client c: liste) {
				System.out.println(c);
			}
		}else {
			 System.out.println("la liste est vide !!");
		}
	}
	public void options() {
		System.out.println("1-creer un client \n 2-retrait \n 3-versment \n 4-liste \n 5-afficher l'aide \n 6-quitter");
		
	}
}
