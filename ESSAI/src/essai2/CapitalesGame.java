package essai2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CapitalesGame {

	public static void main(String[] args) {

		final int NUMBER_OF_QUESTIONS = 3;
		int score = 0, index;
		String pays, capitale, user_answer;

		ArrayList<Integer> indexesAlreadyTaken = new ArrayList<>();
		
		String[][] data = getData();


		Scanner clavier = new Scanner(System.in);

		for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
			// choisir un pays de manière aléatoire
			do {
				Random random = new Random();
				index = random.nextInt(data.length);
			} while (indexesAlreadyTaken.contains(index));

			indexesAlreadyTaken.add(index);

			pays = data[index][0];
			capitale = data[index][1];

			// Demander à l'utilisateur d'entrer la capitale de ce pays
			System.out.printf("Quelle est la capitale de ce pays: %s\n?", pays);
			user_answer = clavier.nextLine();

			if (capitale.equalsIgnoreCase(user_answer)) {
				System.out.println("Bonne réponse!");
				score++;
			} else {
				System.out.printf("Mauvaise reponse. Il fallait repondre %s", capitale);
			}
		}

		System.out.printf("C'est termine. << Score : %d/%d >>", score, NUMBER_OF_QUESTIONS);
		clavier.close();

	}
	
	static String [][] getData(){
		String[][] data = { { "Senegal", "Dakar" }, { "France", "Paris" }, { "Nigéria", "Lagos" },
				{ "Gabon", "Libreville" }, { "Allemagne", "Berlin" }, { "Italie", "Rome" }, { "Monaco", "Monaco" },
				{ "Libéria", "Monrovia" }, { "Perou", "Lima" }, 
				};
		return data;
	}
}
