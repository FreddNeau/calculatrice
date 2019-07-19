package essai2;

public class TableauxMulti {

	public static void main(String[] args) {
		int[][] scores = { { 5, 3, 6, 15, 3 }, // position 0
				{ 3, 8, 4 }, // position 1
				{ 18, 14, 2, 9 } };//position 2

		for (int i = 0, nbRows = scores.length; i < nbRows; ++i) {
			for (int j = 0, nbColumns = scores[i].length; j < nbColumns; ++j) {
				System.out.println(scores[i][j] + "");
			}
			System.out.println();
		}
	}
}