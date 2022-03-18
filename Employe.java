package mypackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employe {
	
	//Attributes
	private String Matricule;
	private String Nom;
	private String Prenom;
	private Date AnneeNaissance = new Date();
	private Date AnneeEmbauche = new Date();
	private double Salaire;
	
	//Getters
	public String getMatricule() {return Matricule;}
	public String getNom() {return Nom;}
	public String getPrenom() {return Prenom;}
	public Date getAnneeNaissance() {return AnneeNaissance;}
	public Date getAnneeEmbauche() {return AnneeEmbauche;}
	public double getSalaire() {return Salaire;}

	//Setters
	public void setMatricule(String newMatricule) {this.Matricule = newMatricule;}
	public void setNom(String newNom) {this.Nom = newNom;}
	public void setPrenom(String newPrenom) {this.Prenom = newPrenom;}
	public void setAnneeNaissance(Date newAnneeNaissance) {this.AnneeNaissance = newAnneeNaissance;}
	public void setAnneAmbauche(Date newAnneeAmbauche) {this.AnneeEmbauche = newAnneeAmbauche;}
    public void setSalaire(double newSalaire) {this.Salaire = newSalaire;}
    
    //constructeur Surchargé
	public Employe(String newMatricule, String newNom , String newPrenom, Date newAnneeNaissance, Date newAnneeAmbauche, double newSalaire ) {
		this.Matricule = newMatricule;
		this.Nom = newNom;
		this.Prenom = newPrenom;
		this.AnneeNaissance = newAnneeNaissance;
		this.AnneeEmbauche = newAnneeAmbauche;
		this.Salaire = newSalaire;
	}
	
	public int getAge( Date currentDate) {            
			    // validate inputs ...                                                                               
			    DateFormat formatter = new SimpleDateFormat("yyyyMMdd");                           
			    int d1 = Integer.parseInt(formatter.format(AnneeNaissance));                            
			    int d2 = Integer.parseInt(formatter.format(currentDate));                          
			    int age = (d2 - d1) /10000;                                                       
			    return age;                                                                        
			}
	
	
	public int getAnciennete(Date currentDate) {            
	    // validate inputs ...                                                                               
	    DateFormat formatter = new SimpleDateFormat("yyyyMMdd");                           
	    int d3 = Integer.parseInt(formatter.format(AnneeEmbauche));                            
	    int d2 = Integer.parseInt(formatter.format(currentDate));                          
	    int anciennete = (d2 - d3) /10000;                                                       
	    return anciennete;                                                                        
	}
	
	public void AugmentatonDuSalaire(int anciennte) {
		if(anciennte < 5 ) {
			Salaire += Salaire * 2/100;
			System.out.println("Le salaire de l'employe a été augmenté de 2% , Salaire = " + Salaire + "\n");
		}else if (anciennte >= 5 && anciennte < 10 ) {
			Salaire += Salaire * 5/100;
			System.out.println("Le salaire de l'employe a été augmenté de 5% , Salaire = " + Salaire + "\n");
		}else if( anciennte >= 10) {
			Salaire += Salaire * 10/100;
			System.out.println("Le salaire de l'employe a été augmenté de 10% , Salaire = " + Salaire + "\n");
		}else {
			System.out.println("L'anciennete est incorrecte, ressayer svp");
		}
	}
	
	public void AfficherEmploye() {
		System.out.println(getNom() + " " + getPrenom() + ", est un employe né le " + getAnneeNaissance() + 
				", sa matricule est : " + getMatricule() + "\n" +" , la date de son embauche est " + getAnneeEmbauche() + 
				", son salaire : " + getSalaire() + "\n");

	}
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date dateNaisance = sdf.parse("2001-12-09");
		Date dateAmbauche = sdf.parse("2010-05-26");
		
		
		Employe employe = new Employe("K12960", "WIREVan", "Yerve", dateNaisance , dateAmbauche , 9000);
		employe.AfficherEmploye();
		
		System.out.println("Age : " + employe.getAge(new java.util.Date(System.currentTimeMillis())) + "\n");
		System.out.println("Anciennete : " + employe.getAnciennete(new java.util.Date(System.currentTimeMillis())) + "\n");
		
		int anciennte = 6;
		employe.AugmentatonDuSalaire(anciennte);
	}

}
