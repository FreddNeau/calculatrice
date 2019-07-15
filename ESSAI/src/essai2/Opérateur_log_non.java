package essai2;

import java.util.Scanner;

public class Opérateur_log_non {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		int nbre = 0;

		System.out.println("Entrer un nombre: ");
		nbre = clavier.nextInt();

		if (!(nbre > 0)) {
			System.out.println("Le nombre entré est négatif. ");
		}

	}

}
