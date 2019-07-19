package essai2;

import java.util.Scanner;

public class AstucesEtPrecisions {

	public static void main(String[] args) {
		
		System.out.println("Entrer un nombre compris entre 1 et 3 : ");
		Scanner clavier = new Scanner(System.in);

		int number = clavier.nextInt();
		
		switch (number ) {
		case 1 :
			System.out.println("Vous avez entré 1");
			break;
		case 2 :
			System.out.println("Vous avez entré 2");
			break;
		case 3 :
			System.out.println("Vous avez entré 3");
			break;
		default :
			System.out.println("Entrer une valeur entre 1 et 3");
			break;
		}
		
	}

}
