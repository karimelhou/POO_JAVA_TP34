package mypackage;

import java.util.Vector;
import java.util.Enumeration;

public class Rectangle extends Figure {
	private int longueur;
	private int largeur;

	public Rectangle(int abscisse, int ordonnee, int couleur, int longueur, int largeur) {
		super(abscisse, ordonnee, couleur);
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public static Vector getInstances() {
		int nRectangle = 0;
		Vector instancesRectangle = new Vector();
		Vector instances = Figure.getInstances();
		Enumeration e = instances.elements();
		Figure uneFigure;
		while (e.hasMoreElements()) {
			uneFigure = (Figure) e.nextElement();
			if (uneFigure instanceof Rectangle)
				instancesRectangle.add(uneFigure);
		}
		return instancesRectangle;
	}

	public String toString() {
		return (super.toString() + " " + longueur + " " + largeur);
	}
}
