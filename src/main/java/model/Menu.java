package model;

import java.util.Scanner;

public class Menu {

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		menu1();
		int menu = sc.nextInt();
		if (menu == 1) {
			int menu2 = sc.nextInt();
			System.out.println("1) Cr�ation d'un vol \n"
					+ "2) Liste des vols \n"
					+ "3) ../ \n\n   Entrez votre choix :");
			
			if (menu2==1) {
				
			} else if(menu2==2) {
				
			} else if (menu2==3) {
				
			} else {
				System.out.println("Demande rejet�e.");
			}
			
		} else if (menu == 2) {
			System.out.println("1) Cr�ation d'une r�servation \n"
					+ "2) Liste des r�servations \n"
					+ "3) ../ \n\n   Entrez votre choix :");
		}
		System.out.println("ok");
		sc.close();
	}
	
	
	public static void menu1() {
		System.out.println("1) Gestion des vols \n"
				+ "2) Gestion des r�servations \n"
				+ "3) Quitter \n\n   Entrez votre choix :");
	}
	
}
