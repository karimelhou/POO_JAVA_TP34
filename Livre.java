package mypackage;


public class Livre {
		private String Titre; // private = restricted access
		private String Auteur;
		private double Prix;
	
	
	//Getter
	public String getTitre() {return Titre;}
	public String getAuteur() {return Auteur;}
	public double getPrix() {return Prix;}
	
	//Setters
	public void setTitre(String newTitre) {this.Titre = newTitre;}
	public void setAuteur(String newAuteur) {this.Auteur = newAuteur;}
	public void setPrix(double newPrix) {this.Prix = newPrix;}
	
	
	/* La surcharge de constructeurs en Java est une technique consistant 
	à avoir plusieurs constructeurs avec différentes listes de paramètres. 
	Ils sont disposés de manière à ce que chaque constructeur effectue une 
	tâche différente. Ils sont différenciés par le compilateur par le nombre 
	de paramètres dans la liste et leurs types. */
	
	
	 //creating constructor overloading
	
	public Livre(String myTit, String myAut, double myPrix) {
	   Titre = myTit;
	   Auteur = myAut;
	   Prix = myPrix;
	}
	
	void display(){System.out.println(Titre+" "+Auteur+" "+Prix);}  
	
	public static void main(String[] args) {
		
		//The user should add values  
	    Livre Livre1 = new Livre("Road to infinity","Aryan",250);  
	    Livre1.display();  
		

	}
}
