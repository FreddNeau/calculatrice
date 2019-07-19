package essai2;

import java.util.Scanner;

public class Fonctions {

	private static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		String nom;
		System.out.printf("Entrer votre nom:");
		nom = clavier.nextLine();
		System.out.printf("Bonjour %s\n", nom);
		
		direBonjour();
		direBonjour();
		direBonjour();
		direBonjour();
		
		
	}
	
	static void direBonjour() {
		String nom;
		System.out.printf("Entrer votre nom:");
		nom = clavier.nextLine();
		System.out.printf("Bonjour %s\n", nom);
		System.out.println();
	}
}
