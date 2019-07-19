package essai2;

public class Tableaux {

	public static void main(String[] args) {
		int [] tab1 = {1,2,3};
		int [] tab2 = {1,2,4};
		
		if (tab1 == null || tab2 == null ||tab1.length != tab2.length) {
				System.out.println("Différents");
		}else {
			int i = 0;
			while( i< tab1.length && tab1[i] == tab2[i]) { //on parcourt élément par élément
				++i;
			}
			
			if(i>=tab1.length) {
				System.out.println("Egaux");
			} else {
				System.out.println("Différents");
			}
			}
			}
}