package mypackage;

import java.util.Vector;

public class Figure {
	private static Vector instances = new Vector();
	private int abscisse;
	private int ordonnee;
	private int couleur;

	public Figure(int abscisse, int ordonnee, int couleur) {
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
		this.couleur = couleur;
		instances.add(this);
	}

	public static Vector getInstances() {
		return instances;
	}

	public String toString() {
		return (abscisse + " " + ordonnee + " " + couleur);
	}
}
