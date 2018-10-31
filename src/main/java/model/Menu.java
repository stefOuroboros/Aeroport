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
					//Création d'une réservation
				case 2 :
					//Liste des réservations d'un vol
				case 3 :
					//Annuler une réservation
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
				+ "2) Gestion des réservations \n"
				+ "3) Quitter \n\n   Entrez votre choix :");
		}
		
		
	public static void menuVol(Scanner sc) {
		System.out.println("1) Création d'un vol \n"
				+ "2) Liste des vols \n"
				+ "3)Recherche d'un avion par numéro \n"
				+ "4) Recherche d'un avion par ville de départ ou d'arrivée \n"
				+ "5) ..");
		}
	public static void menuReservation(Scanner sc) {
		System.out.println("1) Réserver un vol \n"
				+ "2) Voir les réservations d'un vol \n"
				+ "3) Annuler une réservation \n"
				+ "4) Consulter toutes les réservations d'un utilisateur \n"
				+ "5) ..");
		}
}
