package mypackage;

public class Document {
	private int numEnregistrement;
	private String titre;
	static private int numeroSuivant = 0;
	
	
	public Document (String Titre) {
		this.numEnregistrement = numeroSuivant; 
		numeroSuivant++;
		this.titre = Titre;
	}
	
	public int getnumEnregistrement()
	{
		return numEnregistrement;
	}
	public String getTitre()
	{
		return titre;
	}
	
	public String toString() {
		return ("numero: "+numEnregistrement+" titre: "+titre);
	}

	public static void main(String[] args) {
		

	}

}
