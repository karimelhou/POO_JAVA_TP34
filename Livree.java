package mypackage;

public class Livree extends Document {
	private String Auteur;
	private int numPage;

	public Livree(String titre, String Aut, int numP) {
		super(titre);
		this.Auteur = Aut;
		this.numPage = numP;
	}

	public String getAuteur() {
		return Auteur;
	}

	public int getNombreDePages() {
		return numPage;
	}

	public String toString() {
		return (super.toString() + " auteur: " + getAuteur() + " pages:" + getNombreDePages());
	}

	public static void main(String[] args) {

	}

}
