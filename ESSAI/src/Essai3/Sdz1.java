package Essai3;

public class Sdz1 {
	 
	
	public static void main(String[] args)
	  {
		  Ville v = new Ville(null, null, 0);
		  Ville v1 = new Ville("Marseille","France", 123456 );       
		  Ville v2 = new Ville("Rio", "Br�sil", 321654);

		  System.out.println("\n v = "+v.getNom()+" ville de  "+v.getNombreHabitants()+ " habitants se situant en "+v.getNomPays());
		  System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
		  System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
		          
		  /*
		    Nous allons interchanger les Villes v1 et v2
		    tout �a par l'interm�diaire d'un autre objet Ville.        
		  */       
		  Ville temp = new Ville("Marseille", null, 0);
		  temp = v1;
		  v1 = v2;
		  v2 = temp;
		         
		  System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
		  System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

		  /*       
		    Nous allons maintenant interchanger leurs noms
		    cette fois par le biais de leurs mutateurs.
		  */   
		  v1.setNom("Hong Kong");
		  v2.setNom("Djibouti");
		        
		  System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
		  System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
	  }
	          
	}