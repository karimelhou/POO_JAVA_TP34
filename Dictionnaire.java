package mypackage;

public class Dictionnaire extends Document {
	private String Langue;
	private int numTomes;

	public Dictionnaire(String titre, String langue, int numt) {
		super(titre);
		this.Langue = langue;
		this.numTomes = numt;
	}

	public int getNombreDeTomes() {
		return numTomes;
	}

	public String getLangue() {
		return Langue;
	}

	public String toString() {
		return (super.toString() + " tomes: " + getNombreDeTomes() + " langue:" + getLangue());
	}

	public static void main(String[] args) {

	}

}
