package Correction;

import java.util.*;

public class Principale {
	public static void main(String... Args) {
		Operation p = new Operation();
		p.options();
		int choix=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Faites votre choix : ");
			choix = sc.nextInt();
			switch(choix) {
				case 1:
					p.ajoutClient();
					break ;
					
				case 2 :
					p.retrait();
					break ;
					
				case 3 :
					p.versement();
					break ;
					
				case 4 :
					p.afficherClient();
					break ;
					
				case 5: 
					p.options();
					break ;
					
			}
		}
		while (choix!=6);
		
	}
}
