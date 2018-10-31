package model;

import java.util.Scanner;

import dao.VolsDao;

public class Menu {
	
	private Menu() {
	} 
	
	public static void menuBase() {
		Scanner sc = new Scanner(System.in);
		menu1(sc);
		
		//user edit
		int choice = sc.nextInt();
		switch (choice) {
			case 1 :
				menuVol(sc);
				switch (choice) {
					case 1 :
						VolsDao volsDao = VolsDao.instance();
						Vol newFlight = new Vol(VolsDao.getFlightByScan(sc));
						volsDao.persist(newFlight);
						break;
					case 2 :
						VolsDao vol2Dao = VolsDao.instance();
						vol2Dao.findAll();
						break;
					case 3 :
						VolsDao vol3Dao = VolsDao.instance();
						vol3Dao.find(sc.nextLong());
						break;
					case 4 :
						VolsDao vol4Dao = VolsDao.instance();
						vol4Dao.findByCity();
						break;
					case 5 :
						break;
					default :
						break;
				}
			case 2 :
				menuReservation(sc);
				switch (choice) {
				case 1 : 
					//Cr�ation d'une r�servation
				case 2 :
					//Liste des r�servations d'un vol
				case 3 :
					//Annuler une r�servation
				case 4 :
					//Consulter les resa d'un person
				case 5 :
					break;
				}
			case 3 :
				break;
			default : break;
			}

	}
	public static void menu1(Scanner sc) {
		System.out.println("1) Gestion des vols \n"
				+ "2) Gestion des r�servations \n"
				+ "3) Quitter \n\n   Entrez votre choix :");
		}
		
		
	public static void menuVol(Scanner sc) {
		System.out.println("1) Cr�ation d'un vol \n"
				+ "2) Liste des vols \n"
				+ "3)Recherche d'un avion par num�ro \n"
				+ "4) Recherche d'un avion par ville de d�part ou d'arriv�e \n"
				+ "5) ..");
		}
	public static void menuReservation(Scanner sc) {
		System.out.println("1) R�server un vol \n"
				+ "2) Voir les r�servations d'un vol \n"
				+ "3) Annuler une r�servation \n"
				+ "4) Consulter toutes les r�servations d'un utilisateur \n"
				+ "5) ..");
		}
}
