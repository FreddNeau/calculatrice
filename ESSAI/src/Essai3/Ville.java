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
	 
	  //Constructeur par d�faut
	  public Ville(String nomVille, String nomPays,int nbreHabitants){
		  
	    System.out.println("Cr�ation d'une ville !");          
	    nomVille = "Inconnu";
	    nomPays = "Inconnu";
	    nbreHabitants = 0;
	  }
	 
	  //Constructeur avec param�tres
	  //J'ai ajout� un � p � en premi�re lettre des param�tres.
	  //Ce n'est pas une convention, mais �a peut �tre un bon moyen de les rep�rer.
	  
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

		  //D�finit le nom de la ville
		  public void setNom(String pNom)
		  {
		    nomVille = pNom;
		  }

		  //D�finit le nom du pays
		  public void setNomPays(String pPays)
		  {
		    nomPays = pPays;
		  }

		  //D�finit le nombre d'habitants
		  public void setNombreHabitants(int nbre)
		  {
		    nbreHabitants = nbre;
		  }  
		
	}
