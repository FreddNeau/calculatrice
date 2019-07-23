package Essai3;

public class Ville {
	
	
	  private String nomVille;
	  private String nomPays;
	  private int nbreHabitants;
	 
	  //Stocke le nom de notre ville
	  //String nomVille;
	  //Stocke le nom du pays de notre ville
	 // String nomPays;
	  //Stocke le nombre d'habitants de notre ville
	  //int nbreHabitants;
	 
	  //Constructeur par défaut
	  public Ville(String nomVille, String nomPays,int nbreHabitants){
		  
	    System.out.println("Création d'une ville !");          
	    nomVille = "Inconnu";
	    nomPays = "Inconnu";
	    nbreHabitants = 0;
	  }
	 
	  //Constructeur avec paramètres
	  //J'ai ajouté un « p » en première lettre des paramètres.
	  //Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
	  
		  //*************   ACCESSEURS *************
		    
		  //Retourne le nom de la ville
		  public String getNom()  {  
		    return nomVille;
		  }

		  //Retourne le nom du pays
		  public String getNomPays()
		  {
		    return nomPays;
		  }

		  // Retourne le nombre d'habitants
		  public int getNombreHabitants()
		  {
		    return nbreHabitants;
		  } 
		 
		  //*************   MUTATEURS   *************

		  //Définit le nom de la ville
		  public void setNom(String pNom)
		  {
		    nomVille = pNom;
		  }

		  //Définit le nom du pays
		  public void setNomPays(String pPays)
		  {
		    nomPays = pPays;
		  }

		  //Définit le nombre d'habitants
		  public void setNombreHabitants(int nbre)
		  {
		    nbreHabitants = nbre;
		  }  
		
	}
