package essai2;

import java.util.Scanner;

public class Boucles_for {

	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <=100; i++) { System.out.println("Le double de " + i +
		 * " est " + 2*i);
		 */

		// table de multiplication de 9 avec boucle for
		/*
		 * final int NOMBRE = 4; for (int i = 1; i <= 10; i++) {
		 * System.out.println("9 multiplié par " + i + " est : " + (NOMBRE * i)); }
		 */

		// boucle while

		Scanner clavier = new Scanner(System.in);

		int age = 0;

		do {
			System.out.println("Entrer votre age");
			age = clavier.nextInt();
			
			if(age<=0) {
				System.out.println("L'âge doit être positif !");
			}
			
		} while (age <= 0);

		System.out.println("Suite du programme...");
	}
}
