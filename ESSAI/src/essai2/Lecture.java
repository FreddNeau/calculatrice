package essai2;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);

	int n = 0;
	
	
	System.out.println("Entrer un nombre: ");
	n= clavier.nextInt();
	
	System.out.println("Le carré de " + n + "est" + (n*n));
	}

}
