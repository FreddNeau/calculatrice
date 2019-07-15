package essai2;

public class Variables {

	public static void main(String[] args) {
		//Déclaration de variables
		int a = 3, b=4;
		int temp;
		
		temp = a;
		a = b;
		b=temp;
		
		//Affichage du résultat
		System.out.println("a="+a+"\nb="+b);

	}

}
